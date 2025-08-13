package Collections;
import java.util.*;
public class DequeInterfaceGetFirstMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create an Object of Deque
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //add numbers at the end of the Deque
        deque.add(222222);
        deque.add(333333);
        deque.add(444444);
        deque.add(555555);
        //print the Deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque head: " + deque.getFirst());

    }
}
