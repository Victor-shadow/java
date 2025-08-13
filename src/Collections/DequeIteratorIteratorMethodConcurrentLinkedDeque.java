package Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeIteratorIteratorMethodConcurrentLinkedDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new ConcurrentLinkedDeque<Integer>();
        //add numbers to the Deque
        deque.add(1000);
        deque.add(2000);
        deque.add(3000);
        deque.add(4000);
        //Call iterator method of Deque
        Iterator iterator = deque.iterator();
        //print elements of the Iterator
        //created from the Deque
        System.out.println("The iterator values" + " of Deque are:");
        //print the elements using an iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
