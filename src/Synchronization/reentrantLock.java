package Synchronization;
import java.util.concurrent.locks.ReentrantLock;

class Lock{
    //counter variable shared across the threads
    private static int c = 0;
    //Lock object
    private static ReentrantLock lock = new ReentrantLock();
    public static void increment(){
        //acquire the lock
        lock.lock();
        try {
            c++;
            System.out.println(Thread.currentThread().getName() + " incremented counter to: " + c);
        }
        finally {
         //unlock used to release the lock
            lock.unlock();
        }
    }

    public static void main(String[]args){
        Runnable task = () -> {
            for (int i = 1; i < 3; i++){
                increment();
            }
        };
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
//The shared counter "c" multiple threads increment the counter, but the lock ensure only one thread accesses it at a time
//preventing race conditions
//The lock is acquired with lock.lock() and released with lock.unlock()
//Unlock statement is always called in the finally block to ensure that the lock is released evn if an exception is thrown
//in the method body(try block)