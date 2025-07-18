package Multithreading;

class Counter{
    private int c = 0; //shared variable
    //Synchronized method to increment counter
    public synchronized void inc(){
        c++;
    }
    //Synchronized method to get counter value
    public synchronized int get(){
        return c;
    }
}
public class ThreadSynchronization {
    public static void main(String[]args){
        Counter object = new Counter();//shared resource
        //Thread 1 to increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                object.inc();
            }
        });
        //Thread 2 to increment counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                object.inc();
            }
        });
        //Start both threads
        thread1.start();
        thread2.start();
        //wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //print final counter value
        System.out.println("Counter: " + object.get());
    }
}
//Two threads thread1 and thread2 increment the shared counter variable  concurrently
//the inc and get methods are synchronized, meaning only one thread can execute these methods at a time
//preventing race conditions
//The program ensures that the final value of the counter is consistent and currently updated by both threads
