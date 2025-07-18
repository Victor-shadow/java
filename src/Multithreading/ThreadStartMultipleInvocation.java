package Multithreading;
//Multiple invocation of start() method
//Class extends Thread Class
class ThreadStartA extends Thread{
   //Override run() method
    @Override
    public void run(){
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
        System.out.println("Run method invoked");
    }
}
public class ThreadStartMultipleInvocation {
   public static void main(String[]args){
       //Create thread
       ThreadStartA thread = new ThreadStartA();
       thread.start();
       thread.start();
   }
}
