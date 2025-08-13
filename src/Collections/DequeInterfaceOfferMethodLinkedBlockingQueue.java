package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceOfferMethodLinkedBlockingQueue {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        if (deque.offer(1))
            System.out.println("The deque is not full and 1 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(2))
            System.out.println("The deque is not full and 2 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(3))
            System.out.println("The deque is not full and 3 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(4))
            System.out.println("The deque is not full and 4 is inserted");
        else
            System.out.println("The deque is full");
        //print the deque
        System.out.println("Deque: " + deque);


    }
}
