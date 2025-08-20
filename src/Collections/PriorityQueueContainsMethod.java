package Collections;
import java.util.*;
public class PriorityQueueContainsMethod {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //add() method to add elements to the PQ
        priorityQueue.add(10);
        priorityQueue.add(15);
        priorityQueue.add(20);
        priorityQueue.add(25);
        priorityQueue.add(30);
        priorityQueue.add(35);
        priorityQueue.add(40);

        //display thr PQ
        System.out.println("PriorityQueue: " + priorityQueue);
        //check for '15' in the queue
        System.out.println("Does the queue contain '15'? " + priorityQueue.contains(15));
        //check for '25' in the queue
        System.out.println("Does the queue contain '25'? " + priorityQueue.contains(25));
        //check for '50' in the queue
        System.out.println("Does the queue contain '50'? " + priorityQueue.contains(50));

    }
}
