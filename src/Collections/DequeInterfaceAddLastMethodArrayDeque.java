package Collections;
import java.util.*;
public class DequeInterfaceAddLastMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.addLast(111111);
        deque.addLast(222222);
        deque.addLast(333333);
        deque.addLast(444444);
        //print deque
        System.out.println("Deque: " + deque);

    }
}
