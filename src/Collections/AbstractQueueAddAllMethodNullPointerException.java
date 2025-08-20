package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueAddAllMethodNullPointerException {
    public static void main(String[]args) throws Exception{
        try {
            //Create an Object of AbstractQueue
            AbstractQueue<Integer> abstractQueue = null;
            //print AbstractQueue
            System.out.println("AbstractQueue contains: " + null);
            AbstractQueue<Integer> abstractQueue1 = new LinkedBlockingQueue<Integer>(3);
            //print AbstractQueue1 initially
            System.out.println("AbstractQueue1 initially contains: " + abstractQueue1);
            //add elements of AbstractQueue to AbstractQueue1
            abstractQueue1.addAll(null);
            System.out.println("AbstractQueue1 after addition contains: " + abstractQueue1);

        }
        catch (Exception e){
            System.out.println("Exception: " + e);
        }

    }
}
