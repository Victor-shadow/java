package Collections;
import java.util.*;
public class PriorityQueueOperations {
    public static void main(String[]args){
        //Create a PriorityQueue with an Initial capacity of 10
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(10);
        //add elements into the priority Queue
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(5);
        priorityQueue.add(4);
        //print the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);
        //peek at the top element of the queue
        System.out.println("Peek: " + priorityQueue.peek());
        //remove the top element of the queue
        priorityQueue.poll();
        //print the queue
        System.out.println("PriorityQueue after removing top elements: " + priorityQueue);
        //Check if the Queue contains a Specific element
        System.out.println("Does the queue contain 3? " + priorityQueue.contains(3));
        //get the size of the queue
        System.out.println("Size of queue: " + priorityQueue.size());
        //remove all elements from the queue
        priorityQueue.clear();
        //check if the queue is empty
        System.out.println("Is the queue empty? " + priorityQueue.isEmpty());
    }
}
