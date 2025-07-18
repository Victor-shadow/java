package Multithreading;
import java.lang.*;

class ThreadPriority extends Thread{
    //run() method for the thread that is called  as soon as start() is invoked for thread in main
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is running with priority " + Thread.currentThread().getPriority());
    }
    //Main driver method
    public static void main(String[]args){
        //Create random threads with the help of the class
        ThreadPriority thread1 = new ThreadPriority();
        ThreadPriority thread2 = new ThreadPriority();
        ThreadPriority thread3 = new ThreadPriority();

        //Display priority of the above threads
        System.out.println("thread 1 priority: " +thread1.getPriority());
        System.out.println("thread 2 priority: " + thread2.getPriority());
        System.out.println("thread 3 priority: " + thread3.getPriority());

        //Set the thread priorities by passing integer arguments
        thread1.setPriority(2);
        thread2.setPriority(5);
        thread2.setPriority(8);

        //Error will be thrown in this case
        //thread3.setPriority(21);

        //Last execution as priority is low
        System.out.println("thread 1 priority: " + thread1.getPriority());
        System.out.println("thread 2 priority: " + thread2.getPriority());
        System.out.println("thread 3 priority: " + thread3.getPriority());

        //start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        //thread - 0, 1, 2 signify 1, 2, 3 respectively
    }

}
//Threads with a higher priority get an execution chance first prior to other threads
//The default priority for the main thread is always 5, it can be changed later
//The default priority for all the other threads depends on the parent thread