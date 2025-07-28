package Multithreading;

// Concurrency problem solution
class CounterOne {
    // Shared resource
    private int count = 0;

    // Synchronized method to ensure thread-safe increment
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

// Thread class that uses CounterOne
class CounterThread extends Thread {
    private CounterOne counter;

    public CounterThread(CounterOne counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Running the thread: " + this.getName());
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

// Driver class
public class ThreadsConcurrency {
    public static void main(String[] args) {
        CounterOne counter = new CounterOne();

        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        Thread t3 = new CounterThread(counter);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}

//CounterOne class
// it contains a private integer count as the shared resource
//The increment method is synchronized, ensuring that only one thread can execute it at a time
//preventing concurrent modifications

//CounterThread class
//Extends thread and, it is designed to increment the shared counter object
//The run method increments the counter 1000 times

//Main class
//creates a single counter instance shared among the three CounterThread instances
//Starts the thread and waits for them to finish using join
//print the final count which should be 3000 = 1000 increments from each of the threads