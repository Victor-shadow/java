///To add an element to the queue, we can use the add() method
/// The insertion order is not retained in the PriorityQueue
/// The elements are stored based on  priority order which is ascending by default


package Collections;
import java.util.*;
public class QueueInterfaceAddElements {
    public static void main(String[]args){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Scala");
        queue.add("Rust");

        System.out.println(queue);


    }
}
