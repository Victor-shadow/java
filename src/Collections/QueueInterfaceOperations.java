package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceOperations {
    public static void main(String[]args){
        Queue<String> queue = new LinkedList<>();
        //add elements to the queue
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Berry");
        queue.add("Apple");
        queue.add("Pineapple");

        System.out.println("Queue: " + queue);
        //remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);
        //print the updated Queue
        System.out.println("Updated Queue after removal: " + queue);
        //add another element to the queue
        queue.add("date");
        //peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        //print the updated queue
        System.out.println("Peeked queue: " + queue);
    }
}
