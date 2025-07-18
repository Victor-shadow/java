package Multithreading;
//Helper class extends Thread Class
class ThreadName extends Thread{
    //Parameterized constructor
    ThreadName(String name){
    //Call to constructor of Thread ClASS
        //as super keyword refers to parent class
        super(name);
    }
    //run method for thread
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
}
public class ThreadNameUsingConstructor {
    public static void main(String[]args){
        //Create two threads
        ThreadName thread1 = new ThreadName("ThreadA");
        ThreadName thread2 = new ThreadName("ThreadB");
        //Get the name of the threads
        System.out.println("Thread 1:" + thread1.getName());
        System.out.println("Thread 2:" + thread2.getName());
        //Start the threads
        thread1.start();
        thread2.start();
    }
}
