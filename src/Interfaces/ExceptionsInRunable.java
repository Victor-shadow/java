package Interfaces;
import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionsInRunable  {
    private class RunnableImpl implements Runnable{
        //Override run() method
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + ", executing run() method!");

            //Checked exception can't be thrown Runnable must handle checked exception itself
            try{
                throw new FileNotFoundException();
            }
            catch (FileNotFoundException e){
                System.out.println("Must Catch the error here!");
                e.printStackTrace();
            }
            int r = 1/ 0;
            //Example of  thrown runtime Exception
            //throw new NullPointerException();
        }
    }
    public static void main(String[]args){
        System.out.println("Main Thread is: " + Thread.currentThread().getName());

        //Create a thread
        Thread t1 = new Thread(new ExceptionsInRunable().new RunnableImpl());
        //Running the thread
        t1.start();
    }
}
//The output shows that the Runnable cannot throw checked exceptions, FileNotFoundException must handle checked exceptions in the run()
//but RuntimeExceptions are handled by the JVM automatically