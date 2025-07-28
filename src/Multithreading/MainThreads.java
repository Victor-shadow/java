package Multithreading;
import java.io.*;
import java.util.*;
//Class 1
//Main class extends Thread class
public class MainThreads extends Thread{
    //Main driver method
    public static void main(String[]args){
        //Get reference to the main thread
        Thread t = Thread.currentThread();
        //Get name of the main thread
        System.out.println("Current Thread: " + t.getName());
        //change the name of the main thread
        t.setName("thread-1");
        System.out.println("After name change: " + t.getName());
        //Get priority of the main thread
        System.out.println("Main thread priority: " + t.getPriority());
        //set priority of the main thread
        t.setPriority(MAX_PRIORITY);
        //print and display main thread priority
        System.out.println("Main thread new priority: " + t.getPriority());

        for (int i =0; i < 5; i++){
            System.out.println("Main thread");
        }
        //Main thread create a child thread
        Thread child = new Thread(){
            //run method for main thread
            public void run(){
                for (int i =0; i<5; i++){
                    System.out.println("Child thread.");
                }
            }
        };
        //Getting priority of the child thread
        //which will be inherited from the main thread
        //as it is created by the main thread
        System.out.println("Child Thread new priority: " + child.getPriority());
        //start child thread
        child.start();
    }
}
//Helper class extends Thread class
//Child Thread class
 class ThreadControlChildThread  extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            //Print statement whenever child thread is called
            System.out.println("Child thread");
        }
    }
}
