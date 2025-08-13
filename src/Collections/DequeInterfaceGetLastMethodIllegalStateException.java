package Collections;
import java.util.*;
public class DequeInterfaceGetLastMethodIllegalStateException {
    public static void main(String[]args)throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the queue
        deque.add(11);
        deque.add(22);
        deque.add(33);
        deque.add(44);
        deque.add(55);
        //print deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque's head: " + deque.getLast());
        //clear the deque
        deque.clear();
        System.out.println("Deque's head: " + deque.getLast());

    }
}
