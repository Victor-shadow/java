package Collections;
import java.util.*;
public class PriorityQueueOfferMethod {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        //add() method to add elements into the queue
        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(25);
        queue.add(30);
        //display the PriorityQueue
        System.out.println("Initial PriorityQueue: " + queue);
        //insert using offer
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        //display the final queue
        System.out.println("PriorityQueue after insertion: " + queue);

    }
}
