package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceOfferMethodNullPointerException {
    public static void main(String[]args) throws NullPointerException{
        //Create Queue Obj
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add number to end of queue
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);
        //insert null
        deque.offer(null);
        //print deque
        System.out.println("Deque: " + deque);

    }
}
