//A Thread is automatically destroyed when the run() method has completed.
//It may be required to kill or stop a thread before it has completed its life cycle
//Modern ways to suspend/stop a thread are by using a boolean flag and Thread.interrupt() method

//METHODS TO STOP A THREAD
//Using Boolean flag:
//One can define a boolean variable which is used for stopping or killing threads say 'exit'
//whenever, we want to stop a thread the 'exit' variable will set to true
package Multithreading;
class ThreadTest implements Runnable{
    //to stop the thread
    private boolean exit;
    private String name;
    Thread t;

    ThreadTest(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        exit = false;
        t.start();//starting the thread
    }
    //execution of thread starts from run() method
    public void run(){
        int i = 0;
        while (!exit){
            System.out.println(name + ": " + i);
            i++;
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Caught:" +e);
            }
        }
        System.out.println(name + " Stopped. ");
    }
    //for stopping the thread
    public void stop(){
        exit = true;
    }
}
public class ThreadStop {
    public static void main(String[]args){
        //create two objects t1 & t2 of MyThread
        ThreadTest object = new ThreadTest("First Thread");
        ThreadTest object2 = new ThreadTest("Second Thread");
        try{
            Thread.sleep(500);
            object.stop();
            object2.stop();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Caught:" + e);
        }
        System.out.println("Exited the main thread");

    }
}