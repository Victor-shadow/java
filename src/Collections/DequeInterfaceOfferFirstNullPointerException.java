package Collections;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceOfferFirstNullPointerException {
    public static void main(String[]args) throws NullPointerException{
        //Create Deque Obj
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add number to end of deque
        deque.offerFirst(100);
        deque.offerFirst(200);
        deque.offerFirst(300);
        //when null is inserted
        deque.offerFirst(400);
        //prnt Deque
        System.out.println("Deque: " + deque);

    }
}
