package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceAddFirstMethodLinkedBlockingDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Object of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        //print the deque
        System.out.println("Deque: " + deque);

    }
}
