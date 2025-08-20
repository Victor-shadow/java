/// The java.util.PriorityQueue.offer() method is used to insert a particular element in the PriorityQueue
/// It acts similar to the add() method of the PriorityQueue
/// Syntax: PriorityQueue.offer(Object element)
/// Parameter: The parameter element is of the type PriorityQueue and, it refers to the element to be inserted
/// to the Queue
/// Return value: The method returns true if the value is successfully inserted into the queue
/// Exceptions - The method can throw two types of Exceptions:
/// i)NullPointerException: If the element to be inserted is Null
/// ii)ClassCastException:If an element to be inserted is of different type that cannot be compared to existing elements
/// of the Queue

package Collections;
import java.util.*;
public class PriorityQueueOffer {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<>();
        //add() method to add elements to the Queue
        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Python");
        queue.add("Scala");
        queue.add("Rust");
        queue.add("Groovy");
        //display the PriorityQueue
        System.out.println("Initial PriorityQueue: " + queue);
        //insert using offer
        queue.offer("The ");
        queue.offer("Programming");
        queue.offer("Language");
        //display the final queue
        System.out.println("PriorityQueue after insertion: " + queue);



    }
}
