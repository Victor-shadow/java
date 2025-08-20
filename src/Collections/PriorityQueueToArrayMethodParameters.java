/// The java.util.priorityQueue.toArray(arr[]) method in Java is used to form an array of the same elements
/// as that of the PriorityQueue
/// Basically, it copies all the elements from a priorityQueue to a new array
/// It creates multiple arrays
/// This method copies all the elements into the arr[]
/// Syntax: Object[]arr1 = PriorityQueue.toArray(arr[])
/// Parameters: This method accepts one parameter arr[] into which all the elements of the queue
/// are to be copied
/// Return : This method returns an array containing the elements similar to that of the priorityQueue
/// Exception: this method throws the following Exception:
/// ArrayStoreException: When the mentioned array is different type and is not able to compare with the elements
/// mentioned in the queue
/// NullPointerException: If the array is Null, then this exception is thrown
package Collections;
import java.util.*;
public class PriorityQueueToArrayMethodParameters {
    public static void main(String[]args) {
        //Create an Empty PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        //add elements to the queue
        priorityQueue.add("Java");
        priorityQueue.add("Kotlin");
        priorityQueue.add("Scala");
        priorityQueue.add("Python");
        priorityQueue.add("Rust");
        priorityQueue.add("Javascript");
        priorityQueue.add("Ruby");
        //display the priorityQueue
        System.out.println("The PriorityQueue: " + priorityQueue);
        //Create an array and use toArray()
        String[] arr = new String[7];
        String[] arr1 = priorityQueue.toArray(arr);
        //display arr
        System.out.println("The arr[] is: ");
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
        //display arr1
        System.out.println("The arr1[] is: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
