package Collections;
import java.util.*;
public class DequeInterfaceElementMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //add numbers to the end of the deque
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);
        //print deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque's head: " + deque.element());

    }
}
