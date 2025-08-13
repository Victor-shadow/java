package Collections;
import java.util.*;
public class DequeInterfaceAddMethodArrayDeque {
    public static void main(String[]args) throws IllegalArgumentException{
        //Create Object of Deque
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //add numbers to the end of the deque
        deque.add(100);
        deque.add(200);
        deque.add(300);
        deque.add(400);

        System.out.println("Deque: " + deque);


    }
}
