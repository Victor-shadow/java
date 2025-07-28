package Multithreading;
import java.util.*;
import java.io.*;
//Method 1- Thread Class
class ThreadImpl extends Thread{
    //Method to start thread
    @Override
    public void run(){
        String str = "Thread Class implementation Thread" + " is Running successfully";
        System.out.println(str);
    }
}
//Method 2- Runnable Interface
class RunnableThread implements Runnable{
    //Method to start the Thread
    @Override
    public void run(){
        String str = "Runnable Interface Implementation Thread" + " is Running successfully";
        System.out.println(str);
    }
}
public class ThreadsRunning {
    public static void main(String[]args){
        //Method 1 - Thread class
        ThreadImpl t1 = new ThreadImpl();
        t1.start();
        //Method 2 - Runnable Interface
        RunnableThread r2 = new RunnableThread();
        Thread t2 = new Thread(r2);
        t2.start();
        //Wait for both threads to finish before printing the final result
        try{
            //Ensure t1 finishes before processing
            t1.join();
            //Ensures t2 finishes before processing
            t2.join();

    } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
