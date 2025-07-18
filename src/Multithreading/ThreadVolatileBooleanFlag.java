package Multithreading;

public class ThreadVolatileBooleanFlag {
    //static used here because a non-static variable cannot be referenced from a static context
    //Exit variable to stop both the main and inside threads
    static volatile boolean exit = false;
    public static void main(String[]args){
        System.out.println("Started the main thread...");
        //A thread inside main thread
        new Thread(){
            public void run() {
                //changes made to exit in main thread is visible here
                System.out.println("Started inside thread....");
                //will not run infinitely
                while (!exit) {
                    //this will be printed
                    System.out.println("exit inside thread...");
                }
            }
            }.start();
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println("Caught: " + e);
        }
        //stop the threads
        exit = true;
        System.out.println("exiting main thread...");
    }
}

//using volatile boolean flag does not lead into infinite loops
//The volatile variable is directly stored in the main memory
//Changes made by one thread are visible to other threads


