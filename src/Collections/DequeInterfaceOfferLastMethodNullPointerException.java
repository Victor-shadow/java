package Collections;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceOfferLastMethodNullPointerException {
    public static void main(String[]args) throws NullPointerException{
        //Create Deque Obj
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers to end of deque
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);
        //when null is inserted
        deque.offerLast(null);
        //print Deque
        System.out.println("Deque: " + deque);
    }
}
