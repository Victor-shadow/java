package Synchronization;
import java.io.*;
//synchronized method using an anonymous class
class Test{
    synchronized void test_func(int n){
        //synchronized method
        for (int i = 1; i <= 3; i++){
            System.out.println(n + i);
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class SynchronizedMethodAnonymousClass {
  public static void main(String[]args){
      //only one object
      final Test o = new Test();
      Thread a = new Thread(){
          public void run(){
              o.test_func(15);
          }
      };
      Thread b = new Thread(){
          public void run(){
              o.test_func(20);
          }
      };
      a.start();
      b.start();
  }
}
//The Test class has a synchronized method test_func() that prints a sequence of numbers with a slight delay
//ensuring thread safety when accessed by multiple threads
//Two threads are created using anonymous classes each calling the test_func() method with different values
//The synchronized keyword ensures that only  one thread can execute  the method at a time
