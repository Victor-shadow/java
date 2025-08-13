package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceGetFirstMethodConcurrentLinkedDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create an Object of Deque
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        //add numbers to the end of the deque
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        //print Deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque head: " + deque.getFirst());

    }
}
