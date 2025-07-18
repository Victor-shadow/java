package Multithreading;

class Count{
    private int c = 0;
    //Method with synchronized block
    public void inc(){
        synchronized (this){ //synchronize only this block only
            c++;
        }
    }
    //Method to get counter variable
    public int get(){
        return c;
    }
}
public class ThreadSynchronizationBlock {
    public static void main(String[]args){
        Counter count = new Counter();
        //Thread One to Increment the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                count.inc();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                count.inc();
            }
        });
        //start both threads
        thread1.start();
        thread2.start();

        //Wait for threads to finish
        try{
            thread1.join();
            thread2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        //print final counter value
        System.out.println("Counter: " + count.get());

    }

}
