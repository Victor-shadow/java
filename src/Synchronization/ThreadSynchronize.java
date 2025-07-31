package Synchronization;

import java.io.IOException;

class CounterObject{
    //counter variable
    private int c = 0;
    //synchronized method
    public synchronized void increment(){
        c++;
    }
    public int getCount(){
        return c;
    }
}


public class ThreadSynchronize {
    public static void main(String[]args) throws IOException {
        CounterObject o = new CounterObject();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                o.increment();
            }
        });
        Thread t2 = new Thread(() -> {
           for (int i = 0; i < 1000; i++){
               o.increment();
           }
        });
        t1.start();
        t2.start();

          try {
              t1.join();
              t2.join();
          }
          catch (InterruptedException e){
              e.printStackTrace();
          }

        System.out.println("Count: " + o.getCount());


    }
}
//the Counter class has a shared count variable
//The increment() method is synchronized and ensures that only one thread can access and modify the
//count variable at a time.
//This prevents race conditions where multiple threads might try to increment the counter simultaneously
//that leads to incorrect results
//The synchronized block guarantees that the counter is incremented correctly even when multiple
//threads are running