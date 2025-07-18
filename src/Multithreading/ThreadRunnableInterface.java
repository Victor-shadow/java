package Multithreading;
import java.util.*;
import java.io.*;

//Class
//Helper class implements Runnable Interface
class ThreadOne implements Runnable{
    //run method inside this class
    public void run(){
        //Iteration to get more execution of threads
        for (int i = 0; i < 5; i++){
            //Print statement whenever run() method of this class is called
            System.out.println("Thread 1");
            //Getting sleep method in a try-block to catch exceptions
            try{
                //Make threads pause for a certain time using sleep method
                Thread.sleep(1000);
            }
            catch (Exception e){
            }
        }
    }
}
//Class 2
//Helper class implements Runnable Interface
class ThreadTwo implements Runnable {
    //RUN METHOD INSIDE THE CLASS
    public void run() {
        for (int i = 0; i < 5; i++) {
            //print statement whenever run method of this class is invoked
            System.out.println("Thread 2");
            //GET SLEEP METHOD IN TRY-CATCH BLOCK TO TRACE ANY EXCEPTIONS
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class ThreadRunnableInterface {
    public static void main(String[]args){
        //Create Reference of Runnable in the main class
        Runnable object = new ThreadOne();
        Runnable object2 = new ThreadTwo();
        //Create references of thread class by passing object of Runnable in constructor of Thread class
        Thread thread1 = new Thread(object);
        Thread thread2 = new Thread(object2);
        //Start the execution of our own run method
        thread1.start();
        thread2.start();
    }

}
