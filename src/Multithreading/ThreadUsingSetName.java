//one can set(change) the thread name by calling setName method on that thread object
//it will change the name of the thread

//Syntax
//public final void setName(String name)
//Parameter: A String that specifies thread name

package Multithreading;
//helper class extends Thread class
class ThreadNaming extends Thread{
    //Override run method
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
}
public class ThreadUsingSetName {
    public static void main(String[]args){
        //Create Threads
        ThreadNaming thread = new ThreadNaming();
        ThreadNaming thread1 = new ThreadNaming();
        //Fetch the created thread names
        System.out.println("Thread 1: " + thread.getName());
        System.out.println("Thread 2: " + thread1.getName());
        //start the threads
        thread.start();
        thread1.start();
        //Change the names of the threads
        thread.setName("THREAD A");
        thread1.setName("THREAD B");
        //print the new names of the threads
        System.out.println("Thread names after changing" + " the thread names");
        //print the names
        System.out.println("New Thread 1 name: " + thread.getName());
        System.out.println("New Thread 2 name: " + thread1.getName());
    }
}
