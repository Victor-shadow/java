package Multithreading;

class DaemonThreadOne extends Thread{
    public DaemonThreadOne(String name){
        super(name);
    }
    //Override the run method
    public void run(){
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Check if it is Daemon Thread: " + Thread.currentThread().isDaemon());
    }
}
public class DaemonThreadException {
    public static void main(String[]args){
        DaemonThreadOne thread1 = new DaemonThreadOne("thread-1");
        DaemonThreadOne thread2 = new DaemonThreadOne("thread-2");
        try{
            thread1.start();
            //Exception as thread is started
            thread1.setDaemon(true);
            thread2.start();
        }
        catch (IllegalThreadStateException e){
            System.out.println("Illegal thread State Exception Thrown:");
        }
    }
}
