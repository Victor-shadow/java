package Multithreading;
import java.lang.*;

class ThreadSleepMethodCustomThread extends Thread{
    //Override the run() method
    @Override
    public void run(){
        //Use throws keyword followed by the exception name keyword for throwing the exception
        try{
            for (int i = 0; i < 5; i++){
                //method will sleep the thread
                Thread.sleep(1000);
                //print the value of the variable
                System.out.println(i + " ");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[]args){
        //created thread
        ThreadSleepMethodCustomThread object = new ThreadSleepMethodCustomThread();
        object.start();
    }

}
