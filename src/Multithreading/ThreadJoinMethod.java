//java.lang.Thread class provides the join() method which allows one thread to wait until another thread completes execution
//If t is a Thread object whose thread is currently executing then t.join method will make sure that t is terminated before the next instruction is executed by the program
//If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify the waiting period
//However, as with sleep, join is dependent on the OS for timing , so you should not assume that join will wait exactly as long as you specify
//There are three overloaded join functions

//1)join() =It will put the current Thread on wait until the thread on which it is called is dead. If the thread is interrupted then it will
//throw an InterruptedException
//syntax: public final void join()

//2)join(long millis) = It will put the current thread on wait until the thread on which it is called is dead or wait for the specified time(milliseconds)
//syntax:
//public final synchronized void join(long millis)

//3)join(long millis int nano) = it will put the current thread on wait until the thread on which it is called is dead or
//wait for the specified time(milliseconds + nanos)
//syntax
//public final synchronized void join(long millis, int nanos)
package Multithreading;
import java.io.*;
//Create threads by creating objects for that class
class ThreadJoin extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread: " + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has: " + "been caught " + ex);
            }
            System.out.println(i);
        }
    }
}
class ThreadJoinMethod{
    public static void main(String[]args){
        //Create threads
        ThreadJoin object = new ThreadJoin();
        ThreadJoin object2 = new ThreadJoin();
        ThreadJoin object3 = new ThreadJoin();

        //thread1 starts
        object.start();
        //starts second thread after the first thread has died
        try{
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            object.join();
        }
        catch (Exception ex){
            System.out.println("Exception has " + "being caught " + ex);
        }

        //thread 2 starts
        object2.start();
        //start thread3 after thread 2 has died
        try{
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            object2.join();
        }
        catch (Exception ex){
            System.out.println("Exception has " + "being caught " + ex);
        }

        //thread3 starts
        object3.start();
        try{
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            object3.join();
        }
        catch (Exception ex){
            System.out.println("Exception has: " + "being caught " + ex);
        }
    }
}
