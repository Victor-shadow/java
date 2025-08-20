/// The java.util.PriorityQueue.clear() method is used to remove all elements from the PriorityQueue
/// Using the clear() method only clears all the elements from the queue and does not delete the queue
/// The clear() method is only used to empty an existing PriorityQueue
/// Syntax; PriorityQueue.clear()
/// Parameter: the method does not take any parameter
/// Return value:The function does not return any value



package Collections;
import java.util.*;
public class PriorityQueueClear {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<>();
        //add elements to the queue
        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Scala");
        queue.add("Python");
        queue.add("Rust");
        queue.add("C++");
        queue.add("C#");
        //display the PriorityQueue
        System.out.println("PriorityQueue: " + queue);
        //Clear the PriorityQueue
        queue.clear();
        //display the final queue
        System.out.println("The final queue: " + queue);

    }
}
