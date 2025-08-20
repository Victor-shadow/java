/// There are multiple ways to iterate through a queue
/// The most common way to iterate through a queue is to convert the queue to the array and traverse using for loop
/// The queue also has an inbuilt iterator which can be used to iterate through the queue
package Collections;
import java.util.*;
public class QueueInterfaceIterateElements {
    public static void main(String[]args){
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Java");
        pq.add("Kotlin");
        pq.add("Scala");
        pq.add("C#");
        pq.add("C++");
        pq.add("Golang");
        pq.add("Python");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }


    }
}
