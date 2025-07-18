package Multithreading;
//using setDaemon()  method
//Helper class extends thread class
class Daemon extends Thread{
    //Override the run method
    @Override
    public void run(){
        System.out.println("Running the Daemon Thread");
    }
}
public class ThreadSetDaemonMethod {
    public static void main(String[]args){
        Daemon thread = new Daemon();
        thread.setDaemon(true);
        thread.start();
    }

}
//It will not show output as JVM shuts down before the run() method is executed
