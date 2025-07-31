package Synchronization;

class Print extends Thread{
    //synchronized method will lock the object and release when thread is terminated
    synchronized public void printThread(int n){
        for (int i =1; i <= 10; i++){
            System.out.println("Thread " + n + " is working...");
            try {
                //pause the execution of the current thread
                //for 600 ms
                Thread.sleep(600);
            }
            catch (Exception ex){
                //overrides toString() method and
                //prints if the exception occurs
                System.out.println(ex.toString());
            }
        }
        System.out.println("-------------------------------");
        try {
            //pause the execution of the current thread for 1000 ms
            Thread.sleep(1000);
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
//creating thread1 extends Thread class
class ThreadA extends Thread{
    PrintTest test;
    ThreadA(PrintTest p){
        test = p;
    }
    public void run(){
        test.printThread(1);
    }
}

//create thread 2 extends Thread  class
class ThreadB extends  Thread{
    PrintTest test;
    ThreadB(PrintTest p){
        test = p;
    }
    public void run(){
        test.printThread(2);
    }
}

public class SynchronizedMethod {
  public static void main(String[]args){
      PrintTest p = new PrintTest();
      //passing the same object of the class PrintTest to both threads
      ThreadA t1 = new ThreadA(p);
      ThreadB t2 = new ThreadB(p);
      //start function will execute the threads
      t1.start();
      t2.start();
  }
}
