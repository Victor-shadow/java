package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceElementMethodConcurrentLinkedDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        //add elements into the deque
        deque.add(111);
        deque.add(222);
        deque.add(333);
        deque.add(444);
        //print Deque
        System.out.println("Deque: " + deque);
        //print Head
        System.out.println("Deque's head: " + deque.element());

    }
}
