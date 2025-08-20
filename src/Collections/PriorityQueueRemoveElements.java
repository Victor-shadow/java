/// To remove an element from a PriorityQueue, we can use the remove() method
/// If there are multiple such objects, then the first occurrence of the object is removed
/// Apart from that, the poll() method is also used to remove the head and return it



package Collections;
import java.util.*;
public class PriorityQueueRemoveElements {
    public static void main(String[]args){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Java");
        priorityQueue.add("Kotlin");
        priorityQueue.add("Rust");
        priorityQueue.add("Scala");
        priorityQueue.add("Python");

        System.out.println("Initial PriorityQueue: " + priorityQueue);
        //use the method
        priorityQueue.remove("Rust");
        System.out.println("After remove: " + priorityQueue);
        System.out.println("Poll Method: " + priorityQueue.poll());
        System.out.println("Final PriorityQueue: " + priorityQueue);
    }
}
//time and space complexities
//time complexity: O(n)
//space complexity: O(n) where n is the number of elements in the PriorityQueue
