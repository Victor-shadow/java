package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeInterfaceOfferMethodConcurrentLinkedDeque {
    public static void main(String []args) throws IllegalStateException{
        //create Deque obj
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        if (deque.offer(10))
            System.out.println("The deque is not full and 10 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(15))
            System.out.println("The deque is not full and 15 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(20))
            System.out.println("The deque is not full and 20 is inserted");
        else
            System.out.println("The deque is full");
        //before the removal of the deque print it
        System.out.println("Deque: " + deque);
    }
}
