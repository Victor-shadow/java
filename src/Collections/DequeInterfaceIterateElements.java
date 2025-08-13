/// The class which implements the Deque interface is ArrayDeque
/// Since a deque can be iterated from both directions, the iterator method of the deque interface
/// provides two ways to iterate
/// One from the first and the other from the last


package Collections;
import java.util.*;
public class DequeInterfaceIterateElements {
    public static void main(String[]args){
        //Initialize a deque
        Deque<String> deque = new ArrayDeque<String>();
        //add() method to insert
        deque.add("Monday");
        deque.addFirst("Tuesday");
        deque.addLast("Wednesday");
        deque.add("Thursday");

        //Forward iteration
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        System.out.println();

        //Reverse Iteration
        Iterator<String> reverseIterator = deque.descendingIterator();
        while (reverseIterator.hasNext()){
            System.out.println(reverseIterator.next() + " ");
        }
    }
}
