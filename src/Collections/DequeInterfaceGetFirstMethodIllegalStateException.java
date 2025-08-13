package Collections;
import java.util.*;
public class DequeInterfaceGetFirstMethodIllegalStateException {
    public static void main(String[]args) throws IllegalStateException{
        //create object of Deque
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the Deque
        deque.add(100);
        deque.add(200);
        deque.add(300);
        deque.add(400);
        deque.add(500);
        //Print Deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque head: " + deque.getFirst());
        deque.clear();
        //deque is empty hence the exception
        System.out.println("Deque head: " + deque.getFirst());

    }
}
