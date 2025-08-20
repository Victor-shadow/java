package Collections;
import java.util.*;
public class PriorityQueueIterateElements {
    public static void main(String[]args){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Java");
        priorityQueue.add("Kotlin");
        priorityQueue.add("Scala");
        priorityQueue.add("Rust");
        priorityQueue.add("Python");
        priorityQueue.add("Javascript");
        priorityQueue.add("PHP");

        Iterator iterator = priorityQueue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
//Time and Space Complexities
//Time complexities: O(n)
//Space Complexities: O(1) per iteration where n is the number of elements in the priorityQueue
