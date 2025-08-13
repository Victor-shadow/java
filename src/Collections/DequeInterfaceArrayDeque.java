package Collections;
import java.util.*;
public class DequeInterfaceArrayDeque {
    public static void main(String[]args){
        //initialize a deque
        Deque<Integer> deque = new ArrayDeque<Integer>(10);
        //add() method to insert elements
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        System.out.println(deque);

        //clear the method
        deque.clear();
        //addFirst() method to insert elements at the start
        deque.addFirst(100);
        deque.addFirst(200);
        //addLast() method to insert elements at the end
        deque.addLast(300);
        deque.addLast(400);

        System.out.println(deque);

    }
}
