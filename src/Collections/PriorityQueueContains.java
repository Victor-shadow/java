/// The java.util.PriorityQueue.contains() method is used to check whether a specific element is present in the
/// PriorityQueue, or not
/// It is used to check if a Queue contains any Particular element or not
/// Syntax: PriorityQueue.contains(Object element)
/// Parameter; The parameter element is of the type PriorityQueue. This is the element that needs to be tested if it is
/// present in the queue or not
/// Return value: This method returns true if the element is present in the queue otherwise it will return false

package Collections;
import java.util.*;
public class PriorityQueueContains {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        //add elements into the queue using add() method
        priorityQueue.add("Java");
        priorityQueue.add("Kotlin");
        priorityQueue.add("Scala");
        priorityQueue.add("Python");
        priorityQueue.add("Ruby");
        priorityQueue.add("Rust");
        priorityQueue.add("C#");
        priorityQueue.add("C++");

        //display the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);
        //check for 'C#' in the queue
        System.out.println("Does the queue contain 'C#': " + priorityQueue.contains("C#"));
        //check for 'c++' in the queue
        System.out.println("Does the queue contain 'C++': " + priorityQueue.contains("C++"));
        //check if the queue contains 'Golang'
        System.out.println("Does the queue contain 'Golang': " + priorityQueue.contains("Golang"));


    }
}
