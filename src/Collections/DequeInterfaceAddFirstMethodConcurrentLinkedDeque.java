package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceAddFirstMethodConcurrentLinkedDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create an Object of Deque
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        //add numbers to the end of the deque
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        //print deque
        System.out.println("deque: " + deque);

    }
}
