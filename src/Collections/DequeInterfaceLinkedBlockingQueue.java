package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceLinkedBlockingQueue {
    public static void main(String[]args) throws IllegalStateException{
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers to end of the deque
        deque.add(2);
        deque.add(3);
        deque.add(5);
        deque.add(7);
        deque.add(11);
        //print the deque
        System.out.println("Deque: " + deque);

    }
}
