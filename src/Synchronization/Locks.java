package Synchronization;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Locks {

    //shared resource accessed by multiple threads
    private static int sharedResource = 0;
    //Reentrant lock for thread synchronization
    private static final Lock lock = new ReentrantLock();

    public static void main(String[]args){
        //create two threads  to increment the shared resource
        Thread t1 = new Thread(new IncrementTask());
        Thread t2 = new Thread(new IncrementTask());
        //start both threads
        t1.start();
        t2.start();
        try {
            //wait for both threads to complete
            t1.join();
            t2.join();
        } catch (InterruptedException ex){
            System.out.println("Thread Interrupted");
        }
        //print final value of shared resource
        System.out.println("Final value of sharedResource: " + sharedResource);
    }
    //Task to increment shared resource
    static class IncrementTask implements Runnable{
        @Override
        public void run(){
            for (int i = 0; i < 1000; i++){
                //acquire the lock
                lock.lock();
                try {
                    sharedResource++;
                }
                finally {
                    //release the lock
                    lock.unlock();
                }
            }
        }
    }
}
//The program creates two threads T1 and T2 that increment a shared resource
//ensuring thread safety by acquiring and releasing the lock before modifying the resource
//Ensures that only one thread can modify a resource at a time
//The program prints the final value of the shared resource after both threads finish execution
