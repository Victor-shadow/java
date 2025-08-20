package Collections;
import java.util.*;
public class PriorityQueueClass {
    public static void main(String[]args){
        //Create an empty PQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //add items to the pQueue
        pq.add(100);
        pq.add(200);
        pq.add(300);
        pq.add(400);

        //print the top element of the Pqueue
        System.out.println(pq.peek());
        //print the top element and remove it from the
        //PQueue container
        System.out.println(pq.poll());
        //print the top element
        System.out.println(pq.peek());

    }
}
