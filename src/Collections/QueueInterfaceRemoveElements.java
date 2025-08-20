/// To remove an element from a queue, we can use the remove() method
/// If there are multiple objects, then the first occurrence of the object is removed
/// The poll() method is also used to remove the head and return it


package Collections;
import java.util.*;
public class QueueInterfaceRemoveElements {
    public static void main(String[]args){
        Queue<String> queue = new PriorityQueue<>();

        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Python");
        queue.add("Scala");
        queue.add("Rust");

        System.out.println("Initial queue: " + queue);

        queue.remove("Java");

        System.out.println("After remove: " + queue);

        System.out.println("Poll Method: " + queue.poll());

        System.out.println("Final Queue: " + queue);

    }
}
