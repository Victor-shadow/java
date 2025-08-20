/// The java.util.priorityQueue.comparator() method shares an important function of setting and
/// returning the comparator that can be used to order the elements in a PriorityQueue
/// the method returns a null value if the queue follows the natural ordering pattern of the elements
/// Syntax: comp_set = (PriorityQueue)priorityQueue.comparator()
/// Parameters: The method does not take any parameters
/// Return value: The method returns a comparator used to order the elements of the queue in a specific order
/// It returns a Null Value if the queue follows the default or natural ordering pattern

package Collections;
import java.util.*;
public class PriorityQueueComparator {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //add elements into the queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        priorityQueue.add(60);

        System.out.println("PriorityQueue values are: " + priorityQueue);
        //Create a Comparator
        Comparator comparator = priorityQueue.comparator();
        //display the Comparator value
        System.out.println("Since the Comparator value is: " + comparator);
        System.out.println("It follows the natural ordering");

    }
}
