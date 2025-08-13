package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceAddLastMethodConcurrentLinkedDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Object of Deque
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        deque.addLast(1000);
        deque.addLast(2001);
        deque.addLast(3002);
        deque.addLast(4003);
        //print deque
        System.out.println("Deque: " + deque);

    }
}
