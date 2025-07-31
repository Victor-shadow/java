package Synchronization;

class Counter{
    private int c  = 0; //shared variables

    //Synchronized method to increment counter
    public synchronized void inc(){
        c++;
    }
    //synchronized method to get counter value
    public synchronized int get(){
        return c;
    }
}
public class synchronization {
    public static void main(String[]args){
        Counter cnt = new Counter();//shared resource
        //Thread 1 to increment counter
        Thread t1  = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                cnt.inc();
            }
        });
        //Thread 2 to increment counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                cnt.inc();
            }
        });
        //start both threads
        t1.start();
        t2.start();
        //wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //print the final counter value
        System.out.println("Counter: " + cnt.get());
    }
}
//Two threads, t1 and t2 increment the shared counter variable concurrently
//The inc() and get() methods are synchronized, meaning only one thread can execute these methods at a time
//preventing race conditions
//The program ensures that the final value of the counter  is consistent, and correctly updated
//by both threads