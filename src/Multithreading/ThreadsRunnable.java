package Multithreading;
//Java program to illustrate the difference between start() and show() method

//Helper class extends main Thread CLass
class ThreadClass extends Thread{
    //Method inside MyThread
    //run() method is invoked as soon thread starts
    public void run(){
        //print statement when thread is called
        System.out.println("Thread 1 is running");
    }
}
//class 2(Main thread class extends Thread class
class SecondThread extends Thread{
    //Method
    public void show(){
        //Print statement when thread 2 is called
        System.out.println("Thread 2 is running ");
    }
}
class ThreadsRunnable {
    public static void main(String[]args){
        //Create ThreadObjects
        ThreadClass object = new ThreadClass();
        SecondThread object2 = new SecondThread();
        //Getting the threads to run state
        //This thread will transcend from runnable to run as start method will look for run method and execute it
        object.start();
        //This thread is simply a function call as no start method is executed so here only a thread is created only followed by a call
        object2.show();
    }


}
