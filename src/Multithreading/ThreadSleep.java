package Multithreading;
import java.lang.*;

public class ThreadSleep implements Runnable {
    Thread t;
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            try{
                //thread to sleep for 1000 milliseconds
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[]args) throws Exception{
        Thread t = new Thread(new ThreadSleep());
        //call run() method
        t.start();
        Thread t2 = new Thread(new ThreadSleep());
        //call run() function
        t2.start();

    }
}
//Based on  the requirements, we can make a thread to be in the sleeping state for a specific
//period of time
//Sleep () method causes the thread to definitely stop execution for a given amount of time
//if no other threads or processes needs to be run, the CPU will be idle(probably enter power-saving mode)