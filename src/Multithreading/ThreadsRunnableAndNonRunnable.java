package Multithreading;
//Java program to illustrate difference between runnable & non-runnable Threads and Single Inheritance

//Helper class ThreadA extends main Thread class
class ThreadA extends Thread{
    //Method inside ThreadB
    //run() method is called as soon as the thread is started
    public void run(){
        //print statement when the thread is called
        System.out.println("Thread A is running");
    }
}

class ThreadB extends Thread {
    //Method
    public void show() {
        //Print statement when thread is called
        System.out.println("Thread 2");
    }
}
class ThreadsRunnableAndNonRunnable {
    //Main Method
    public static void main(String[]args){
        //Create thread objects
        ThreadA object = new ThreadA();
        ThreadB object1 = new ThreadB();

        //Getting the threads to the run state
        //This thread will transcend from runnable to run() as start method is invoked and will look for run() method and call it
        object.start();
        //This thread will now look for run method which will now be absent
        object1.start();
    }
}

//We have created two thread classes for each threads
//In the main method we simply create objects for these thread classes where objects are now threads
//So in main we call thread using start() method over both threads
//Start() method starts both threads and look up for run() method to run
//Here, ThreadA is having the run() method to make the thread transcend from runnable to run state to execute  whereas thread 2 is only created but not put to run state  by the scheduler as its corresponding run() method is missing
//Only threadA is called and threadB is created only and, it is in the runnable state  later blocked by the scheduler  because the corresponding run method is missing
