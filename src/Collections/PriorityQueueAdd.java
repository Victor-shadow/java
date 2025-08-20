/// The java.util.PriorityQueue.add() method in Java is used to add a specific element into a priority Queue
/// This method internally just calls the Java.util.PriorityQueue.offer() method with the value passed to it
/// So it exactly works like the offer() method
/// Syntax: PriorityQueue.add(Object element)
/// Parameter: The parameter is of type PriorityQueue and refers to the element to be added to the Queue
/// Return value: The function returns true if the element is successfully added to the Priority queue


package Collections;
import java.util.*;
public class PriorityQueueAdd {
    public static void main(String[]args){
        //Create an empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<>();
        //add elements into the PriorityQueue
        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Scala");
        queue.add("Python");
        queue.add("Rust");
        queue.add("C#");
        queue.add("C++");
        //display the PriorityQueue
        System.out.println("PriorityQueue: " + queue);
    }

}
