package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceAddLastMethodIllegalStateException {
    public static void main(String[]args) throws IllegalStateException{
        //Create object of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>(5);
        //add numbers to end of the deque
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);

        try {
            //when capacity is full
            deque.addLast(3);
        }
     catch (Exception e){
            System.out.println("Exception thrown " + "while inserting an element " + "when the Deque is already " + "full " + e);
     }
    }
}
