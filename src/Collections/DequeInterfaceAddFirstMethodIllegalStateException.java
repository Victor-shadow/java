package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceAddFirstMethodIllegalStateException {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>(3);
        //add numbers to the end of the deque
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        //add number when capacity is full
        deque.addFirst(5);
        //print the deque
        System.out.println("Deque: " + deque);

    }
}
