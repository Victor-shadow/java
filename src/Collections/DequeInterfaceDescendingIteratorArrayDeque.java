package Collections;
import java.util.*;
public class DequeInterfaceDescendingIteratorArrayDeque {
    public static void main(String[]args){
        //Create an Empty Deque
        Deque<String> deque = new ArrayDeque<String>();
        //add elements
        deque.add("Java");
        deque.add("Kotlin");
        deque.add("C#");
        deque.add("C++");
        deque.add("Python");
        // use descendingIterator method to get the reverse order of elements
        Iterator<String> iterator = deque.descendingIterator();
        //print elements in Reverse order
        while (iterator.hasNext()){
            System.out.println("The iterator in reverse order: " + iterator.next());
        }

    }
}
