package Collections;
import java.util.*;
public class DequeInterfaceGetLastMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //add numbers to the end of the queue
        deque.add(111);
        deque.add(222);
        deque.add(333);
        deque.add(444);
        //print Deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque head: " + deque.getLast());

    }
}
