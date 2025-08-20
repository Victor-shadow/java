package Collections;
import java.util.*;
public class ArrayDequeClass {
    public static void main(String[]args){
        //Initialize a Deque
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>(10);
        //add() method to insert
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.add(40);
        deque.add(50);

        System.out.println(deque);
        //clear method
        deque.clear();
        //addFirst() method to insert the elements at the head
        deque.addFirst(60);
        deque.addFirst(70);
        deque.addFirst(80);

        //addLastMethod to insert elements at the end
        deque.addLast(90);
        deque.addLast(100);
        deque.addLast(110);

        System.out.println(deque);


    }
}
