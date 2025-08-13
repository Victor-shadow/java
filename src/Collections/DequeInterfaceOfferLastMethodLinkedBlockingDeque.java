package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceOfferLastMethodLinkedBlockingDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create a Deque Obj
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        if (deque.offerLast(10))
            System.out.println("The deque is not full and 10 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(20))
            System.out.println("The deque is not full and 20 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(30))
            System.out.println("The deque is not full and 30 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(40))
            System.out.println("The deque is not full and 40 is inserted");
        else
            System.out.println("The deque is full");
        //print Deque
        System.out.println("Deque: " + deque);

    }
}
