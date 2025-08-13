package Collections;
import java.util.*;
public class DequeInterfaceIteratorMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Objects
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the Deque
        deque.add(11);
        deque.add(22);
        deque.add(33);
        deque.add(44);
        deque.add(55);
        //Call iterator method of the Deque
        Iterator iterator = deque.iterator();
        //print elements of the iterator created from the Deque
        System.out.println("The iterator values" + " of Deque are:");
        //print elements using an Iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
