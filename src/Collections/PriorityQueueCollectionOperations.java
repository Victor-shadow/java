package Collections;
import java.util.*;
public class PriorityQueueCollectionOperations {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        //add items to the priorityQueue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        priorityQueue.add(60);
        //print the top element of the PriorityQueue
        System.out.println(priorityQueue.peek());
        //print the top element of the PriorityQueue and remove it from the
        //priorityQueue container
        System.out.println(priorityQueue.poll());
        //print the top element
        System.out.println(priorityQueue.peek());
    }
}
