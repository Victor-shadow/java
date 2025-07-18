package Multithreading;
//Creation and execution of a thread using start() and run() methods in Single Inheritance
//Helper class ThreadSingleInheritance extends main Thread class
class Thread1 extends Thread {

    //Method inside myThread2
    //run() method is called as soon as the thread is started
    public void run(){
        System.out.println("Thread 1 is running");
    }
}
//Class 2
//MyThread2 extends Main Thread CLass
class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}
//Main Class
class ThreadRunnable{
    //Main Method
    public static void main(String[]args){
        //Create two thread objects for classes Thread1 and Thread2
        Thread1 object = new Thread1();
        Thread2 object2 = new Thread2();
        //Getting the threads in run state
        //This thread will transcend from runnable to run as start() method will look for run() method and execute it
        object.start();
        object2.start();
    }
}

//We have created two thread classes for each thread. In the main method we are simply creating objects of these thread classes where the objects are now threads
//So in main, we call thread using start() method over the both threads
//Now start() method starts the threads and look up for their run method to run
//Both thread classes had run() methods therefore, both threads are put to run state from runnable by the scheduler and output on the console is justified