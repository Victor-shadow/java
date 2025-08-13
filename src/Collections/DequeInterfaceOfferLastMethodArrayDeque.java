package Collections;
import java.util.*;
public class DequeInterfaceOfferLastMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Obj
        Deque<Integer> deque = new ArrayDeque<Integer>();
        if (deque.offerLast(1))
            System.out.println("The deque is not full and 1 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(2))
            System.out.println("The deque is not full and 2 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(3))
            System.out.println("The deque is not full and 3 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(4))
            System.out.println("The deque is not full and 4 is inserted");
        else
            System.out.println("The deque is full");
        //print the deque
        System.out.println("Deque: " + deque);

    }
}
