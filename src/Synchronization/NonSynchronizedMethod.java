package Synchronization;

class PrintTest extends Thread{
    //non synchronized code
    //Method 1
    public void printThread(int n){
        //this loop will print the currently executing thread
        for (int i = 1; i <= 10; i++){
            System.out.println("Thread " + n + " is Working...");
            //try block to catch exceptions
            try {
                //pause the execution of the current thread
                //for 0.600 seconds using sleep() method
                Thread.sleep(600);
            }
            //catch block to handle exceptions
            catch (Exception ex){
                //override the existing toString() method
                //prints exception if occurs
                System.out.println(ex.toString());
            }
        }
        //Display message for better readability
        System.out.println("---------------------------");
        try {
            //pause the execution of the main thread  for 0.1000 milliseconds
            //or 1sec  using sleep() method
            Thread.sleep(1000);
        }
        catch (Exception ex){
            //print the exception
            System.out.println(ex.toString());
        }
    }
}
//class 2
class Thread1 extends Thread{
    //declare variable of type Class1
    PrintTest test;
    //constructor for class1
    Thread1(PrintTest p ) {
        test = p;
    }
    //run() method
    public void run(){
        //calling method 1
        test.printThread(1);
    }
}
//Class 3
class Thread2 extends  Thread{
    //Declare variable of type class1
    PrintTest test;
    //constructor for class 2
    Thread2(PrintTest p){
        test = p;
    }
    //run() method for this class
    //for entry points of thread 2
    public void run(){
        //call method 2
        test.printThread(2);
    }
}
//class 4

public class NonSynchronizedMethod {
    //Main Driver method
    public static void main(String[]args){
        //Create an object of class1  inside the main() method
        PrintTest p = new PrintTest();
        //Passing the same object of class PrintTest to
        //both threads
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);

        //start executing the threads
        t1.start();
        t2.start();
        //prints both threads simultaneously

    }
}
