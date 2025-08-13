/// The descendingIterator() method of the Deque Interface returns an iterator over the elements in this deque
/// in the reverse order
/// The elements will be returned from the last to the first order
/// This can be used by any class implementing the Deque Interface like LinkedList, ArrayDeque, LinkedBlockingDeque
/// Syntax: Iterator descendingIterator()


package Collections;
import java.util.*;
public class DequeInterfaceDescendingIteratorLinkedList {
    public static void main(String[]args){
        //Create an Empty Deque
        Deque<Integer> deque = new LinkedList<>();
        //add elements
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        //use descendingIterator() method to get the reverse order of elements
        Iterator<Integer> iterator = deque.descendingIterator();
        //Print elements in reverse order
        while (iterator.hasNext()){
            System.out.println("The iterator in reversed order: " + iterator.next());
        }




    }
}
