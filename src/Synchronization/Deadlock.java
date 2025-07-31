package Synchronization;

import java.lang.annotation.Native;

class Util{
    static void sleep(long millis){
        try {
            Thread.sleep(millis);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

//this class is shared by both threads
class Shared{
    //first synchronized method
    synchronized void test1(Shared s2){
        System.out.println(Thread.currentThread().getName() + " enters test 1 of " + this);
        Util.sleep(1000);
        //try to call Test2
        //on another object
        s2.test2();
        System.out.println(Thread.currentThread().getName() + " exits test 1 of " + this);
    }

    //second synchronized method
    synchronized void test2(){
        System.out.println(Thread.currentThread().getName() + " enters test 2 of " + this);
        Util.sleep(1000);
        //taking object lock of s1 enters
        //into test1 method
        System.out.println(Thread.currentThread().getName() + " exits test 2 of " + this);
    }
}
class ThreadA1 extends Thread{
    private Shared s1;
    private Shared s2;
    //constructor to initialize fields
    public ThreadA1(Shared s1, Shared s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    //run() method to start a thread
    @Override
    public void run(){
        s1.test1(s2);
    }
}

class ThreadA2 extends Thread{
    private Shared s1;
    private Shared s2;
    //Constructor to initialize fields
    public ThreadA2(Shared s1, Shared s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    //run method to start the thread
    @Override
    public void run(){
        s2.test1(s1);
    }
}
public class Deadlock {
    //main method
    public static void main(String[]args){
        //create objects
        Shared s1 = new Shared();
        Shared s2 = new Shared();
        //create first thread and start it
        ThreadA1 t1 = new ThreadA1(s1,s2);
        t1.setName("Thread1");
        t1.start();
        //create second thread and start it
        ThreadA2 t2 = new ThreadA2(s1, s2);
        t2.setName("Thread2");
        t2.start();
    }
}
//Thread t1 starts by acquiring a lock on the s1 and enters the test1() method of s1
//Thread t2 starts by acquiring a lock on the s2 and enters the test1() method of s2
//In the test1() method both threads try to acquire the locks on each others objects but the locks are already held
//by the other thread causing both threads to wait indefinitely for the other to release the lock
//Neither test1() nor test2() methods complete execution and the program remains in the deadlock state
