package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceElementMethodLinkedBlockingDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Object of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers to the end of the Deque
        deque.add(111);
        deque.add(222);
        deque.add(333);
        deque.add(444);
        //print Deque
        System.out.println("Deque: " + deque);
        //print Head
        System.out.println("Deque's head: " + deque.element());

    }
}
