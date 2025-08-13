package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceConcurrentLinkedDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create an Object of deque
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        //add numbers to the deque
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        System.out.println("Deque: " + deque);


    }
}
