package Synchronization;
import java.util.concurrent.TimeUnit;

class counterThread extends Thread{
    private int count;
    //synchronized method to prevent race conditions
    @Override
    public synchronized void run(){
        try {
            TimeUnit.MILLISECONDS.sleep(100); //simulate work with sleep

        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        count++;//Increment the count
    }

    public int getCount() {
        return count;
    }
}
public class SynchronizedModifier {
   public static void main(String[]args) throws InterruptedException{
       counterThread t1 = new counterThread();
       counterThread t2 = new counterThread();

       t1.start();
       t2.start();
       t1.join();
       t2.join();
       //expected output is 1 because only one thread can increment at a time
       System.out.println("Count: " + t1.getCount());

   }
}

//the synchronized method ensures that only one thread can execute the run() method at a time
//preventing race conditions
//Though two threads attempting to increment the count concurrently, the synchronization, ensures they are executed sequentially
