package Synchronization;
import java.util.concurrent.atomic.AtomicInteger;

class countThread extends Thread{
    private AtomicInteger count = new AtomicInteger();//atomic variable

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(i * 50);
                count.incrementAndGet();//simulate work with sleep
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }
    }
    public int getCount(){
        return count.get();
    }
}
public class AtomicModifier {
   public static void main(String[]args) throws InterruptedException{
       countThread t1 = new countThread();
       countThread t2 = new countThread();

       t1.start();
       t2.start();
       t1.join();
       t2.join();
       //expected output is 10 because each thread increments 5 times
       System.out.println("Count: " + (t1.getCount() + t2.getCount()));

   }

}
//The AtomicInteger class ensures that the incrementAndGet() operation is atomic across multiple threads
//Each thread increments the count 5 times so the final output will always be 10 (5 increments per thread)