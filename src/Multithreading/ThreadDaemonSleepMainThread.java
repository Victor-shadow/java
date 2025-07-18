package Multithreading;

class DaemonThreadA extends Thread{
    //Override the run method
    @Override
    public void run(){
        System.out.println("Running the Daemon thread");
    }
}
public class ThreadDaemonSleepMainThread {
    public static void main(String[]args){
        DaemonThreadA thread = new DaemonThreadA();
        thread.setDaemon(true);

        thread.start();
        //Ensure the JVM does not terminate immediately
        try{
            Thread.sleep(100);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
