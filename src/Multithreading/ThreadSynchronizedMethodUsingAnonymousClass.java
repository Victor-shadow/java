package Multithreading;
import java.io.*;
class Test{
    synchronized void test_func(int n){
        //synchronized method
        for (int i = 1; i <= 10; i++){
            System.out.println( n + i);
            try{
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ThreadSynchronizedMethodUsingAnonymousClass {
    public static void main(String[]args){
        //Only one object
        final Test O = new Test();
        Thread a = new Thread(){
            public void run(){
                O.test_func(1000);
            }
        };
        Thread b = new Thread(){
            public void run(){
                O.test_func(2000);
            }
        };

        a.start();
        b.start();
    }

}
//The Test class has a synchronized method test_func that prints a sequence of numbers  with a slight delay, ensuring thread
//safety when accessed by multiple threads
//Two threads are created using anonymous classes each calling test_func() method with different values
//The synchronized keyword ensures that only one thread can execute the method at a time