package Collections;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueRemoveMethod {
    public static void main(String[]args) throws Exception{
        try {
            //Create an object of AbstractQueue<Integer>
            AbstractQueue<Integer> abstractQueue = new LinkedBlockingQueue<Integer>();
            //populate the AbstractQueue
            abstractQueue.add(1);
            //print abstractQueue
            System.out.println("AbstractQueue contains: " + abstractQueue);
            //retrieves the head
            int head = abstractQueue.remove();
            System.out.println("Head: " + head);
            //retrieve the head
            head = abstractQueue.remove();
            System.out.println("Head: " + head);
        }
        catch (Exception e){
            System.out.println("Exception: " + e);
        }

    }
}
