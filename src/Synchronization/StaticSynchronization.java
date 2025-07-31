package Synchronization;
//the synchronized method is declared as "static" which means the lock or monitor is applied on the class
//not on the object
//so that only one thread will access a class at a time
class printTest extends Thread{
    //static synchronization locks the class PrintTest
    synchronized public static void printThread(int n){
        for (int i  =  1; i <= 10; i++){
            System.out.println("Thread " + n + " is working....");
            //try block to check Exception
            try {
                //make the thread to sleep for 0.6sec
                Thread.sleep(600);
            }
            //catch block to handle exception
            catch (Exception ex){
                System.out.println(ex.toString());
            }
        }
        System.out.println("-----------------------------------------");
        try {
            Thread.sleep(1000);
        }
        catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
}

//Helper class extends Thread
class Thread11 extends Thread{
    //run() method for thread
    public void run(){
        //pass the class not the obj
        printTest.printThread(1);
    }
}

class Thread22 extends Thread{
    public void run(){
        printTest.printThread(2);
    }
}

public class StaticSynchronization {
    public static void main(String[]args){
        //No shared object
        //Create objects of class2 and class3 that are extending to Thread class
        Thread11 t1 =new Thread11();
        Thread22 t2 = new Thread22();
        //start the threads
        t1.start();
        t2.start();

    }


}
