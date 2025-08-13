package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceContainsMethodConcurrentLinkedDeque {
    public static void main(String[]args){
        //Create an Empty Deque
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        //add elements into the queue
        deque.add(10);
        deque.add(15);
        deque.add(30);
        deque.add(20);
        deque.add(5);
        //display the Deque
        System.out.println("Deque: " + deque);
        //check for '15' in the Deque
        System.out.println("Does the Deque contain '15' ? " + deque.contains(15));
        //check for '2' in the Deque
        System.out.println("Does the deque contain '2' ? " + deque.contains(2));
        //check if the Deque contains '10'
        System.out.println("Does the deque contain '10'? " + deque.contains(10));

    }
}
