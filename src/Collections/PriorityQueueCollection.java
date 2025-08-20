package Collections;
import java.util.*;
public class PriorityQueueCollection {
    public static void main(String[]args){
        //Priority Queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //add elements to the queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);

        //print the Head of the Queue
        System.out.println("Head of the Queue: " + priorityQueue.peek());

    }
}
