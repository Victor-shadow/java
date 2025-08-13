package Collections;
import java.util.*;
public class DequeInterfaceRemoveElements {
    public static void main(String[]args){
         //Initialize a deque
        Deque<String> deque = new ArrayDeque<String>();
        //add() method to insert
        deque.add("Java");
        deque.add("Kotlin");
        deque.add("Python");

        System.out.println(deque);

        System.out.println(deque.pop());

        System.out.println(deque.poll());

        System.out.println(deque.pollFirst());

        System.out.println(deque.pollLast());
    }
}
