//Using a volatile boolean flag: We can also use a volatile-boolean flag to make code thread safe
//A volatile variable is directly stored in the main memory so that threads cannot have locally cached values of it
//A volatile boolean flag variable is used when more than one thread are accessing the same variable and the changes made by one might not be visible to the other

package Multithreading;
public class ThreadNonVolatileBooleanFlag {
    //static used here since a non-static variable cannot be referenced from a static context
    //exit variable to stop both the main and inside threads
    static boolean exit = false;
    public static void main(String[]args) {
        System.out.println("Started the main thread...");
        //A thread inside the main thread
        new Thread() {
            public void run() {
                System.out.println("Started inside thread...");
                //inside thread caches the value of exit
                //so changes made to exit are not visible
                while (!exit) {
                }
                //this will not be printed
                System.out.println("exiting inside thread....");
            }
        }.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("caught: " + e);
        }
        //stop the thread
        exit = true;
        System.out.println("exiting main thread");
    }
}
//This code runs into an infinite loop and will give a runtime error
//The inside thread never is stopped

