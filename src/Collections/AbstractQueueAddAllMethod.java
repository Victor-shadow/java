package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueAddAllMethod {
    public static void main(String[]args) throws Exception{
        try {
            //Create AbstractQueue Object
            AbstractQueue<Integer> abstractQueue = new LinkedBlockingQueue<Integer>();
            //populate the AbstractQueue
            abstractQueue.add(10);
            abstractQueue.add(20);
            abstractQueue.add(30);
            abstractQueue.add(40);
            abstractQueue.add(50);
            //print AbstractQueue
            System.out.println("AbstractQueue1 contains: " + abstractQueue);
            AbstractQueue<Integer> abstractQueue1 = new LinkedBlockingQueue<Integer>(3);
            //print AbstractQueue1 initially
            System.out.println("AbstractQueue1 initially contains: " + abstractQueue1);
            //add elements of AbstractQueue to AbstractQueue1
            abstractQueue1.addAll(abstractQueue);

            System.out.println("AbstractQueue1 after addition contains: " + abstractQueue1);
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
