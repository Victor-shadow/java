package Collections;
import java.util.*;
public class DequeInterfaceAddFirstMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create object of Deque
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //add numbers to end of the deque
        deque.addFirst(111111);
        deque.addFirst(222222);
        deque.addFirst(333333);
        deque.addFirst(444444);
        //print deque
        System.out.println("Deque: " + deque);

    }
}
