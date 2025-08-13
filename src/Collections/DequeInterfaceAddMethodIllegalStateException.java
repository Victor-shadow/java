package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceAddMethodIllegalStateException {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>(3);
        //add numbers at the end of the deque
        deque.add(111);
        deque.add(222);
        deque.add(333);
        //the capacity is full
        deque.add(444);
        System.out.println("Deque: " + deque);


    }
}
