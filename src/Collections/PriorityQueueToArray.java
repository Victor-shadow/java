/// 1. The java.util.PriorityQueue.toArray() method in java is used to form an array of the same elements
/// as that of the priorityQueue
/// Basically it copies all the elements from a priorityQueue to a new array
/// Syntax: Object[]arr= PriorityQueue.toArray()
/// Parameter: The method does not take any parameter
/// Return value: The method returns an array containing the elements similar to that of the priorityQueue
package Collections;
import java.util.*;
public class PriorityQueueToArray {
    public static void main(String[]args){
        //Create an Empty PriorityQueue
        PriorityQueue<String> queue =new PriorityQueue<String>();
        //use add() method to add all elements to the queue
        queue.add("Java");
        queue.add("Kotlin");
        queue.add("Scala");
        queue.add("Rust");
        queue.add("Python");
        //display the priorityQueue
        System.out.println("The PriorityQueue: " + queue);
        //Create the array
        Object[] array  = queue.toArray();
        System.out.println("The array is: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
}
