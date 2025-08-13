package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceOfferLastMethodConcurrentLinkedDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        if (deque.offerLast(100))
            System.out.println("The deque is not full and 100 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(200))
            System.out.println("The deque is not full and 200 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(300))
            System.out.println("The deque is not full and 300 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(400))
            System.out.println("The deque is not full and 400 is inserted");
        else
            System.out.println("The deque is full");
        //print the deque
        System.out.println("Deque: " + deque);

    }
}
