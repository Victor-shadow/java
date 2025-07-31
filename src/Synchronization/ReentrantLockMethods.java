package Synchronization;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
    private ReentrantLock lock;
    private String name;

    public Worker(ReentrantLock lock, String name){
        this.lock = lock;
        this.name = name;
    }
    @Override
    public void run(){
        while (!lock.tryLock()){
            System.out.println( name + " waiting for lock");
        }
        System.out.println(name + " acquired lock");
        //release the lock after completing the task
        lock.unlock();
        System.out.println(name + " Released lock");
    }
}
public class ReentrantLockMethods {
   public static void main(String[]args){
       ReentrantLock lock = new ReentrantLock();
       ExecutorService pool = Executors.newFixedThreadPool(2);
       //lock acquiring
       pool.execute(new Worker(lock, "Job1"));
       pool.execute(new Worker(lock, "Job2"));

       //shutdown the executor
       pool.shutdown();
   }

}
//The Worker class attempts to acquire the lock with tryLock()
//if the lock() is unavailable it waits and prints the message
//Once acquired, it performs its tasks and releases the lock
//The main method sets up a thread pool with two worker instances, allowing them to run
//concurrently while ensure thread-safe access to the resource
//