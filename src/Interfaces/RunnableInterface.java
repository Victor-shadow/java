package Interfaces;
//java.lang.Runnable is an interface that is to be implemented by a class whose instances are to be executed by a thread
//There are two ways to start a new Thread:
//Subclass Thread
//Implement Runnable


public class RunnableInterface {
    private class runnableImplemention implements Runnable{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + ", executing run method!");
        }
    }
    //Main Method
    public static void main(String[]args){
        System.out.println("Main Thread is: " + Thread.currentThread().getName());

        //Creating the thread
        Thread object1 = new Thread(new RunnableInterface().new runnableImplemention());

        //Execution of the thread
        object1.start();
    }

    //Steps to create a new thread using Runnable
    //Create a Runnable implementer and implement the run method
    //Instantiate the Thread class and pass the implementer to the Thread, The Thread has a constructor
    //which accepts Runnable Instances
    //Invoke start() of Thread instance, start internally call runs() of the implementer
    //Invoking start() creates a new Thread that executes the code written in run
    //Calling run() directly does not create or start a new Thread, it will run in the same thread
}
//The Main Method is executed by the Main Thread
//Invoking the start on RunnableImplementation creates and starts a new thread
