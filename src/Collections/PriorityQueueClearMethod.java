package Collections;
import java.util.*;
public class PriorityQueueClearMethod {
    public static void main(String[]args){
       //Create an empty PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //use add() method to add elements into the queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        //display the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);
        //clear the queue
        priorityQueue.clear();
        //display the final queue
        System.out.println("The final Queue: " + priorityQueue);

    }
}
