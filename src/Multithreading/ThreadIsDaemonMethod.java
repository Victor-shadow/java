package Multithreading;
//use of setDaemon() and isDaemon() method
class DaemonThread extends Thread{
    //Change the name of the thread
    public DaemonThread(String name){
        super(name);
    }
    //Override the run() method
    public void run(){
        //Checking whether the thread is daemon or not
        if (Thread.currentThread().isDaemon()){
            System.out.println(getName() + " is Daemon thread");
        }
        else{
            System.out.println(getName() + " is User Thread");
        }
    }
}
public class ThreadIsDaemonMethod {
    public static void main(String[]args){
        DaemonThread thread1 = new DaemonThread("thread1");
        DaemonThread thread2 = new DaemonThread("thread2");
        DaemonThread thread3 = new DaemonThread("thread3");
        //set thread 1 to Daemon thread
        thread1.setDaemon(true);
        //start the first two threads
        thread1.start();
        thread2.start();
        //set user thread 3 to Daemon
        thread3.setDaemon(true);
        thread3.start();
    }
}
