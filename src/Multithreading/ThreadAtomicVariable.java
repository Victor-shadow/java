package Multithreading;
import java.util.concurrent.atomic.AtomicInteger;
class AtomicCounter extends Thread{
    //Atomic counter Variable
    AtomicInteger count;
    //Class Constructor
    AtomicCounter()
    {
        count = new AtomicInteger();
    }
    //Method which would be invoked upon execution of the thread
    public void run(){
        int max = 1_000_00_000;
        //increment counter
        for (int i =0; i < max; i++){
            count.addAndGet(1);
        }
    }
}
public class ThreadAtomicVariable {
    public static void main(String[]args) throws InterruptedException{
        //Instance of Counter
        AtomicCounter count = new AtomicCounter();
        //Define two threads
        Thread first = new Thread(count,"Thread 1");
        Thread second = new Thread(count, "Thread 2");
        //Threads start execution
        first.start();
        second.start();
        //Main thread will wait for both threads to complete execution
        first.join();
        second.join();
        //print final value of count
        System.out.println(count.count);
    }

}
