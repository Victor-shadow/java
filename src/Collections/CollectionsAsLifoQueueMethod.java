package Collections;
import java.util.*;


public class CollectionsAsLifoQueueMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Creating an Object of Dequeue
            Deque<Integer> deque = new ArrayDeque<Integer>(1);
            //Adding Elements to Dequeue
            deque.add(2);
            deque.add(3);
            deque.add(4);
            deque.add(5);
            //get queue from the deque using asLifoQueue() method
            Queue<Integer> nq = Collections.asLifoQueue(deque);
            //Printing the queue
            System.out.println("View Of the Queue is: " + nq);
        }
         catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
         }
    }
}
