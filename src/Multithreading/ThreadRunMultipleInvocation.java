package Multithreading;
//class extends thread
class ThreadsRun extends Thread{
    //Override the run method
    @Override
    public void run(){
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
        System.out.println("Run method invoked");
    }
}
public class ThreadRunMultipleInvocation {
    public static void main(String[]args){
        //Thread created
        ThreadsRun thread = new ThreadsRun();
        thread.run();
        thread.run();
    }

}
