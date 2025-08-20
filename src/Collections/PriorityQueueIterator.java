/// The java.util.PriorityQueue.iterator() method is used to return an iterator of the same elements of the PriorityQueue
/// The elements are returned in random order from what is present in the Queue
/// Syntax: Iterator iterate_value = PriorityQueue.iterator();
/// Parameter: The function does not take any parameter
/// Return value; The method iterates over the elements of the queue and returns the value(iterators)


package Collections;
import java.util.*;
public class PriorityQueueIterator {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<String> queue = new PriorityQueue<>();
        //add elements into the queue
        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Scala");
        queue.add("Ruby");
        queue.add("Rust");
        queue.add("Python");
        queue.add("C#");
        queue.add("C++");
        //display the PriorityQueue
        System.out.println("PriorityQueue: " + queue);
        //Create an Iterator
        Iterator<String> value = queue.iterator();
        //display the values after iteration
        System.out.println("The iterator values are:");
        while (value.hasNext()){
            System.out.println(value.next());
        }

    }
}
