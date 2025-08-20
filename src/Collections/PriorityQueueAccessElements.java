///The Queue Follows the First-In-First-Out Principle
/// we can access only the head of the queue
/// To access elements from the PriorityQueue, we can use the peek() method
package Collections;
import java.util.*;
public class PriorityQueueAccessElements {
    public static void main(String[]args){
        //Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Java");
        priorityQueue.add("Kotlin");
        priorityQueue.add("Scala");
        priorityQueue.add("Rust");
        priorityQueue.add("Ruby");

        System.out.println("PriorityQueue: " + priorityQueue);
        //use the peek() method
        String element = priorityQueue.peek();
        System.out.println("Accessed Element: " + element);
    }
}
//time and space complexities
//Time Complexities: O(1)
//Space Complexities: O(n) where n, is the number of elements in the priority Queue
