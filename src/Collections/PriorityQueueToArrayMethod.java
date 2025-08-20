package Collections;
import java.util.*;
public class PriorityQueueToArrayMethod {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        //add elements to the queue
        priorityQueue.add(10);
        priorityQueue.add(15);
        priorityQueue.add(20);
        priorityQueue.add(25);
        priorityQueue.add(30);
        priorityQueue.add(35);
        priorityQueue.add(40);
        //display the priorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);
        //create the array and use toArray()
        Object[] arr = priorityQueue.toArray();
        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }

    }
}
