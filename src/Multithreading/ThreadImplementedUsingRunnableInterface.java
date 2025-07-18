package Multithreading;

public class ThreadImplementedUsingRunnableInterface {
    private class RunnableImplement implements Runnable{
        //Override the Run() method
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + ", execute run() method");
        }
    }
    //Main Method
    public static void main(String[]args){
        System.out.println("Main Thread is : " + Thread.currentThread().getName());
        //Creating thread
        Thread thread1 = new Thread(new ThreadImplementedUsingRunnableInterface().new RunnableImplement());
        //Execute the thread
        thread1.start();
    }

}
