package Multithreading;
//deadlock using main method
//main class

public class MainThreadDeadlock {
    public static void main(String[]args){
        //Try block to check for exceptions
        try{
            //Print Statement
            System.out.println("Entering into deadlock");
            //joining the current thread
            Thread.currentThread().join();
            //This statement never executes
            System.out.println("The thread is already in a deadlock");
        }
        //catch block to handle exception
        catch (InterruptedException e){
            //display the exception along with the line number
            e.printStackTrace();
        }
    }

}
//The statement "Thread.currentThread().join()" method will tell main thread to wait for this thread(i.e wait for itself) to die
//Thus the main thread waits for itself to die which is nothing but a deadlock
