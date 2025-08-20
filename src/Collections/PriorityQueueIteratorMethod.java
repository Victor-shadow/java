package Collections;
import java.util.*;
public class PriorityQueueIteratorMethod {
    public static void main(String[]args){
      //Create an empty PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        //use add() method to add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        //Display the PriorityQueue
        System.out.println("PriorityQueue: " + queue);
        //Create an Iterator
        Iterator value = queue.iterator();
        //display values after iteration
        System.out.println("The iterator values are: ");
        while (value.hasNext()){
            System.out.println(value.next());
        }
    }
}
