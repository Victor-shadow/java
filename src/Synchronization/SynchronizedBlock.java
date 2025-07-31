package Synchronization;
//Helper class extends Thread class
class PrintTestA extends Thread{
    //to print the thread
    public void printThread(int n){
        //Making synchronized block
        synchronized (this){
            //Iterate using the loop
            for (int i = 1; i <= 10; i++){
                System.out.println("Thread " + n + " is working...");
                //try block to check for exceptions
                try {
                    //Making thread pause for 0.6 sec
                    Thread.sleep(600);
                }
                catch (Exception ex){
                   System.out.println( ex.toString());
                }
            }
        }
        System.out.println("-----------------------------------------------");
        try {
            Thread.sleep(100);
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}
//Helper class extends Thread
class ThreadAA extends Thread{
    PrintTestA test;
    ThreadAA(PrintTestA p) {
        test = p;
    }
    public void run(){
        test.printThread(1);
    }
}

//Helper class extends Thread
class ThreadBB extends Thread{
    PrintTestA test;
    ThreadBB(PrintTestA p){
        test = p;
    }
    public void run(){
        test.printThread(2);
    }
}
public class SynchronizedBlock {
  public static void main(String[]args){
      //Create instance for class1
      PrintTestA p = new PrintTestA();
      //create threads and passing some object
      ThreadAA t1 = new ThreadAA(p);
      ThreadBB t2 = new ThreadBB(p);
      //start these threads using start method
      t1.start();
      t2.start();
  }
}
