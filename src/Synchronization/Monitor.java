package Synchronization;
import java.io.*;

class sharedDataPrinter{
    //Monitor implementation is carried on using
    //synchronous method
    synchronized public void display(String str){
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
            //try-catch block for exceptions
            //because sleep() method is used
            try {
                //making thread to sleep for nanoseconds
                //as passed in the arguments
                Thread.sleep(100);
            }
            catch (Exception e){
            }
        }
    }
}

class ThreadMonitor extends Thread{
    sharedDataPrinter p;
    //thread
    public ThreadMonitor(sharedDataPrinter p){
        //this keyword refers to the current instance itself
        this.p = p;
    }
    //run() method for this thread invoked  as
    //start method is called on main() method
    public void run(){
        //print Statement
        p.display("Thread Monitor");
    }
}

//class 2
//Helper class extends Thread class
class ThreadMonitor2 extends Thread{
    sharedDataPrinter p;

    public ThreadMonitor2(sharedDataPrinter p){
        this.p = p;
    }
    public void run(){
        //print statement
        System.out.println("Thread Locks");
    }
}
 class Monitor {
    public static void main(String[]args){
        //Instance of shared resource used to print strings
        //(single character at a time)
        sharedDataPrinter printer = new sharedDataPrinter();
        //Thread objects sharing data printer
        ThreadMonitor t1 = new ThreadMonitor(printer);
        ThreadMonitor2 t2 = new ThreadMonitor2(printer);

        t1.start();
        t2.start();

    }
}
//display() method in sharedDataPrinter is synchronized and allows only one thread to access and print characters
//at a time
//Two threads  Thread1, Thread2 share this sharedDataPrinter object
//The synchronized keyword acts as a monitor ensuring that the output from both threads
//is not interleaved