/// The spliterator() method of PriorityQueue returns a Spliterator/the same element as a Priority
/// Queue
/// The returned spliterator is late binding and fail-fast Spliterator
/// A late-binding spliterator binds to the source of the elements means PriorityQueue at the point
/// of first traversal, first split, or first query for estimated size rather than at the time the Spliterator is created
/// it can be used with Streams in java 8 ,Also it can traverse elements individually in bulk
/// Spliterator is a better way to traverse elements as it provides better control over the elements
/// Syntax: public Spliterator<E> Spliterator
/// Return value: The method returns a Spliterator over the elements in a PriorityQueue
///
package Collections;
import java.util.*;
public class PriorityQueueSpliterator {
    public static void main(String[]args){
        //Create a priorityQueue
        PriorityQueue<String > queue =new PriorityQueue<String>();
        //add String to queue
        queue.add("Java");
        queue.add("Haskell");
        queue.add("Scala");
        queue.add("Python");
        queue.add("Rust");
        //use spliterator method
        Spliterator<String> spliterator = queue.spliterator();
        //print result
        System.out.println("list of Strings:");
        //forEachRemaining method of spliterator
        spliterator.forEachRemaining((n) -> System.out.println(n));
    }
}
