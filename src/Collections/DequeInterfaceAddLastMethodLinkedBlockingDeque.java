package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceAddLastMethodLinkedBlockingDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Object of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        deque.addLast(100);
        deque.addLast(200);
        deque.addLast(300);
        deque.addLast(400);
        deque.addLast(500);
        //print Deque
        System.out.println("Deque: " + deque);

    }
}
