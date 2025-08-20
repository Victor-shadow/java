/// The remove() method of the PriorityQueue class of java.util.package is used to remove a particular
/// element from a PriorityQueue
/// The elements while entering the priority Queue are sorted, While taking out elements from the priorityQueue the elements are always sorted being a trait
/// of the priorityQueue
/// The default ordering of priority of elements for data types is defined as:
/// i)Integer: The smallest elements come first(dealing with positive numbers only)
/// ii)String: Alphabetical order
/// Note: We can also insert a Comparator while creating an instance of this class and explains how the priority should be
/// defined
/// Syntax: PriorityQueue<String> pq = new PriorityQueue<String>(Comparator);
/// Remove method: PriorityQueue.remove(Object O)
/// Parameters: The parameter O is the type of PriorityQueue and specifies the element to be removed from the PriorityQueue
/// Return Value: This method returns True if the specified element is present in the Queue else it returns False

package Collections;
import java.io.PrintStream;
import java.util.*;
public class PriorityQueueRemove {
    //Main Driver Method
    public static void main(String[]args){
        //Create an empty PriorityQueue
        //where elements are of a String type
        PriorityQueue<String> queue = new PriorityQueue<String>();
        //add elements into a queue using add() method
        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Scala");
        queue.add("Rust");
        queue.add("Python");
        queue.add("Javascript");
        //print elements of the priorityQueue
        System.out.println("Initial priority queue: " + queue);
        //remove elements from a queue using remove() method
        queue.remove("Java");
        queue.remove("Javascript");
        //display PriorityQueue
        //after removal of elements
        System.out.println("PriorityQueue after removing " + "elements: " + queue);


    }
}
