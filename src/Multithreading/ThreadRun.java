package Multithreading;
//The start() method is used to create a separate call stack for the thread
//A separate call stack is created by it and then the run() method is called by the JVM
//all threads are pushed to the stack if we use run() instead of start()
//When a thread is started using the start() method, the run method is overridden
//When a function is called:
//I)The argument is evaluated
//II)A new stack frame is pushed into the call stack
//III)Parameters are initialized
//IV)Method body is executed
//V)Value is returned, and current frame stack is popped from the call stack
class ThreadWithoutStartMethod extends Thread {
    public void run(){
        try{
            //Display the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e){
            //Throw an Exception
            System.out.println("Exception thrown");
        }
    }
}
//Main class
public class ThreadRun{
    public static void main(String[]args){
        int n = 8;
        for (int i = 0; i < n; i++){
            ThreadWithoutStartMethod object = new ThreadWithoutStartMethod();
            //start() is replaced with run to see its purpose
            object.run();
        }
    }
}
