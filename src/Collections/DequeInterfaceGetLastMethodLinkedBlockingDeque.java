package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceGetLastMethodLinkedBlockingDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers to the end of the deque
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        //print Deque
        System.out.println("Deque: " + deque);
        //print Head
        System.out.println("Deque's head: " + deque.getLast());


    }
}
