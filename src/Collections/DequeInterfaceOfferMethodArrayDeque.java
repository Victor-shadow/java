package Collections;
import java.util.*;
public class DequeInterfaceOfferMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //create Deque object
        Deque<Integer> deque = new ArrayDeque<Integer>();

        if (deque.offer(10))
            System.out.println("The deque is not full and 10 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(20))
            System.out.println("The deque is not full and 20 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(30))
            System.out.println("The deque is not full and 30 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(40))
            System.out.println("The deque is not full and 40 is inserted");
        else
            System.out.println("The deque is full");
        //print the deque
        System.out.println("Deque: " + deque);

    }
}
