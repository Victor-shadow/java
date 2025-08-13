package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceAddMethodNullPointerException {
    public static void main(String[]args) throws IllegalStateException{
        //Create objects of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers at the end of the deque
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(null);
        //print Deque
        System.out.println("Deque: " + deque);

    }
}
