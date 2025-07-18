package Multithreading;

class Aa extends Thread{
    //Method 1
    public void run(){
        //Iterating to print number of times
        for(int i =0; i < 5; i++){
            //print the statement
            System.out.println("Target");
            //Make the thread to sleep() using sleep method
            //Try-Catch block for exceptions
            try{
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
//Class 2
class Bb extends Thread{
    //Method 2
    public void run(){
        //Iterate to print numbr of times
        for (int i =0; i < 5; i++){
            //print statement
            System.out.println("Miss");
            //make thread sleep() using sleep method
            //Try - catch block for exceptions
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
            }
        }
    }
}
public class ThreadSleepMethodInParallelExecution {
    public static void main(String[]args){
        //Create Objects in the main method
        Aa object = new Aa();
        Bb object2 = new Bb();
        //Start the threads using start method
        //start() method calls run method automatically
        object.start();
        object2.start();
    }
}
