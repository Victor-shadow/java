package Collections;
import java.util.*;
public class PriorityQueueSpliteratorMethod {
    public static void main(String[]args){
        //Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        //add a String object to priorityQueue
        priorityQueue.add("Java");
        priorityQueue.add("Scala");
        priorityQueue.add("Python");
        priorityQueue.add("Rust");
        priorityQueue.add("Kotlin");
        priorityQueue.add("Golang");
        priorityQueue.add("Kotlin");
        //use spliterator() method
        Spliterator<String> spliterator = priorityQueue.spliterator();
        //print result from Spliterator
        System.out.println("list of String object");
        //forEachRemaining method
        spliterator.forEachRemaining((n) -> print(n));
    }

    public static void  print(String s){
        System.out.println("Programming Language: " + s);
    }
}
