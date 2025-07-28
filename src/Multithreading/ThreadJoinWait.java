package Multithreading;

public class ThreadJoinWait implements Runnable {
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t.getName());
        //Checks if the current thread is alive
        System.out.println("Is Alive? " + t.isAlive());
    }
    public static void main(String[]args) throws Exception{
        Thread t = new Thread(new ThreadJoinWait());
        t.start();
        //waits for 1000 ms for this thread to die
        t.join(1000);

        System.out.println("\nJoining after 1000" + " milliseconds: \n");
        System.out.println("Current Thread: " + t.getName());
        //Checks if this thread is alive
       System.out.println("Is thread Alive?: " + t.isAlive());
    }

}
//if any executing thread t1 calls join() on t2; i.e; t2.join() immediately t1 will enter into a waiting state
//until t2 completes its execution
//Giving a timeout within join(), will make the join() effect be nullified after the specified timeout
