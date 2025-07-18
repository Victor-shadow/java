//Thread Class contains the sleep() method
//There are two overloaded sleep() methods present in the Thread class
//one is with One Argument and the Other with Two Arguments
//The sleep() method is used to stop the execution of the current Thread(whichever might be executing the system) for
//a specific duration of time and after that time duration is over the thread which is executing earlier starts executing again

//Syntax:
//public static void sleep(long millis)
//public static void sleep(long millis, int nanos)

//Parameters
//millis = Duration of the time in milliseconds for which the thread will sleep
//nanos = this is the additional time in nanoseconds for which the thread is required to sleep. It ranges from 0 to 999999

//Exceptions: InterruptedException
//IllegalArgumentException

//Thread.sleep() pauses the thread's current execution
//Throws InterruptedException if another thread interrupts during sleep
//Actual sleep duration may vary based on system load; higher load increases sleep time

//The sleep() method with one parameter is a native method, its implementation is done in another programming language
//The method with two parameters is not a native method ; Its implementation is done in java
//Both the sleep() methods are static,they can be accessed using the Thread class
//Both methods throw a checked exception, so you must handle the exception using the throws keyword or within try-catch block
package Multithreading;
import java.io.*;
import java.lang.*;
class ThreadSleepMethod {
    public static void main(String[]args){
        //use throws keyword followed by exception name for throwing the exception
        try{
            for (int i = 0; i < 5; i++){
                //sleep the main thread for 1 second
                //for every loop runs
                Thread.sleep(1000);
                //Print value of the variable
                System.out.println(i + " ");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
