package Collections;
import java.util.*;

public class DequeInterfaceElementMethodException {
    public static void main(String[]args) throws IllegalStateException{
        //Create object of Deque
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the deque
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        //print the Deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque head: " + deque.element());
        deque.clear();
        //deque is now empty hence the exception
        System.out.println("Deque head: " + deque.element());

    }
}
