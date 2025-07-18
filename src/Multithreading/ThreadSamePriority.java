package Multithreading;
import java.lang.*;
//Extending thread class

public class ThreadSamePriority extends Thread {
    //run() method for the thread that is invoked as threads are started
    public void run() {
        System.out.println("run method: ");
    }

    public static void main(String[] args) {
        //Main Thread Priority set to 6
        Thread.currentThread().setPriority(6);
        //print and display main thread Priority
        //using getPriority() method of the thread class
        System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
        //Create thread inside main thread
        ThreadSamePriority thread1 = new ThreadSamePriority();
        //thread1 is child of
        //the main thread
        //so thread1 will have a priority of 6 as well

        //print the current priority of the thread
        System.out.println("thread 1 priority: " + Thread.currentThread().getPriority());
    }
}
//if two threads have the same priority, then we can't expect which thread will execute first, it depends on the thread scheduler algorithm(Round Robin)
//FirstComeFirstServed
//if we use thread priority for thread scheduling then we should always keep in mind the underlying platform should provide support for scheduling based on thread priority

//NOTE:Sometimes thread priorities have minimal effect on the scheduler in different systems, To enforce strict priority-based scheduling in HotSpot JVM, we can set the system-level flag - XX:ThreadPriority=1
