package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceGetFirstMethodLinkedBlockingDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Object of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers at the end of the deque
        deque.add(100);
        deque.add(200);
        deque.add(300);
        deque.add(400);
        deque.add(500);
        //print Deque
        System.out.println("Deque: " + deque);
        //print Head
        System.out.println("Deque's head: " + deque.getFirst());

    }
}
