package Multithreading;
//stopping a thread using a interrupt() method
//Thread interrupt() method : Whenever an interrupt has been sent to a thread, it should stop whatever task it is performing
//It is very likely that whenever a thread receives an interrupt it is to be terminated
//This action is performed by this method
//Whenever Thread.interrupt() method is invoked it sets a flag known as interrupt status to true
//This means that the thread has to stop performing further execution
//The default value of this flag is false

class ThreadStart implements Runnable{
    Thread t;
    ThreadStart(){
        t = new Thread(this);
        System.out.println("New Thread: " + t);
        t.start(); //start the thread
    }
    //execution of thread starts from run(0 method
    public void run(){
        while (!Thread.interrupted()){
            System.out.println("Thread is running");
        }
        System.out.println("The thread has stopped");
    }
}

public class ThreadInterruptMethod {
    public static void main(String[]args)
    {
        //Create object of ThreadStart
        ThreadStart t1 = new ThreadStart();
        try{
            Thread.sleep(1);
            //t1 is an object of ThreadStart is of type thread
            t1.t.interrupt();
            Thread.sleep(5);
        }
        catch (InterruptedException e){
            System.out.println("Caught: " + e);
        }
        System.out.println("Exit main thread:");

    }
}
