package Multithreading;

class State implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);  // Simulate work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside State.run() - t1 state (from t2): " + ThreadState.t1.getState());

        try {
            Thread.sleep(200);  // More simulated work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadState implements Runnable {
    public static Thread t1;

    public void run() {
        State object = new State();
        Thread t2 = new Thread(object);

        System.out.println("Before t2.start() - t2 state: " + t2.getState());
        t2.start();

        System.out.println("After t2.start() - t2 state: " + t2.getState());

        try {
            Thread.sleep(150);  // Allow t2 to enter TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("During sleep in t1 - t2 state: " + t2.getState());

        try {
            t2.join();  // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After t2.join() - t2 state: " + t2.getState());
        System.out.println("End of t1 - t1 state: " + t1.getState());
    }

    public static void main(String[] args) {
        ThreadState mainTask = new ThreadState();
        t1 = new Thread(mainTask);

        System.out.println("Before t1.start() - t1 state: " + t1.getState());
        t1.start();
        System.out.println("After t1.start() - t1 state: " + t1.getState());
    }
}