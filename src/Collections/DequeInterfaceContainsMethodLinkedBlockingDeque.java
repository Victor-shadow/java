package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceContainsMethodLinkedBlockingDeque {
    public static void main(String[]args){
        //Create an Empty Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add elements into the deque
        deque.add(1);
        deque.add(3);
        deque.add(5);
        deque.add(7);
        deque.add(9);
        //display the Deque
        System.out.println("Deque: " + deque);
        //check for '1' in the deque
        System.out.println("Does the Deque contain '1'? " + deque.contains(1));
        //check for '2' in the deque
        System.out.println("Does the Deque contain '2'? " + deque.contains(2));
        //check for '9' in the deque
        System.out.println("Does the Deque contain '9'? " + deque.contains(9));

    }
}
