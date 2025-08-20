package Collections;
import java.util.*;
public class PriorityQueueAddMethod {
    public static void main(String[]args){
        //Create an empty PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(25);
        queue.add(30);

        //display the PriorityQueue
        System.out.println("PriorityQueue: " + queue);

    }
}
