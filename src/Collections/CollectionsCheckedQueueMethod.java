package Collections;
import java.util.*;

//The checkedQueue() method of Java Collections is a method that returns a dynamically and typesafe view
//of the given Queue
//Any attempt to insert an element of the wrong type will result in an immediate ClassCastException

//Syntax:
//public static <E> Queue <E> checkedQueue(Queue<E> queue, Class<E> type)
//Parameters:
//queue: it is the queue that is returned for dynamically typesafe view
//type: Data  type of queue elements

//Return Type:
//The method will return the dynamically and typesafe view of the Queue
//Exception:
//ClassCastException: It is a runtime exception raised in Java when we try to improperly cast a class from one type to another
public class CollectionsCheckedQueueMethod {
    public static void main(String[] args) {
        //Create a queue
        Queue<String> data = new PriorityQueue<String>();

        //Add elements
        data.add("Python");
        data.add("PHP/Laravel");
        data.add("Flask");
        data.add("C");

        //create typesafe view of the list
        System.out.println(Collections.checkedQueue(data, String.class));
    }
}