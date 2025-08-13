package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceGetLastMethodConcurrentLinkedDeque {
    public static void main(String[]args)throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        //add numbers to the end of the deque
        deque.add(100);
        deque.add(200);
        deque.add(300);
        deque.add(400);
        //print deque
        System.out.println("Deque: " + deque);
        //print Head
        System.out.println("Deque's head: " + deque.getLast());

    }
}
