package Synchronization;
import java.io.*;
class LineA{
    //if multiple threads(trains) will try to access
    //this unsynchronized method
    //then object state will be corrupted
    public void getLine(){
        for (int i = 0; i < 20; i++){
            System.out.println();
            try {
                Thread.sleep(100);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class TrainA extends Thread{
    //shared obj
    Line line;
    TrainA(Line line){
        //initialize shared obj
        this.line = line;
    }

    @Override
    public void run(){
        //access the getLine() method
        line.getLine();
    }
}
public class UnsynchronizedMethod {
   public static void main(String[]args){
       //shared Line obj
       Line obj = new Line();
       //create the threads that are
       //sharing the same obj
       Train t1 = new Train(obj);
       Train t2 = new Train(obj);
       //threads start execution
       t1.start();
       t2.start();
   }
}
//Two threads (t1 and t2) access the getLine() method of the shared Line object simultaneously
//This results in mixed output because the method is not synchronized and, it allows both threads to execute it concurrently
//This scenario creates a risk of data inconsistency or collision when accessing shared resources