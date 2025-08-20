package Collections;
import java.util.*;
public class QueueInterfaceLinkedList {
    public static void main(String[]args){
        //Create an empty LinkedList
        Queue<Integer> queue = new LinkedList<>();
        //add elements to the list
        queue.add(10);
        queue.add(20);
        queue.add(30);
        //print the top element of the linked list
        System.out.println(queue.peek());
        //print the top element and removing it from the top container
        System.out.println(queue.poll());

        System.out.println(queue.peek());


    }
}
