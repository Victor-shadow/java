package Collections;
import java.util.*;
public class DequeInterfaceAddElements {
    public static void main(String[]args){
        //Initialize a deque
        Deque<String> deque = new ArrayDeque<String>();
        //add() method to insert elements
        deque.add("One");
        deque.addFirst("Two");
        deque.addLast("Three");

        System.out.println(deque);
    }

}
