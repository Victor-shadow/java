/// The getLast() method of the Deque Interface returns the last element or the tail of the Deque
/// It does not delete the element. It throws an Exception when the Deque is empty
/// Syntax E getLast()
/// Parameters: This method does not accept any parameters
/// Return value: This method returns the last elements  or the tail of the Deque but does not delete it
/// Exception: The function throws NoSuchElementException  when the Deque is empty and the function is called

package Collections;
import java.util.*;
public class DequeInterfaceGetLastMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the deque
        deque.add(1000);
        deque.add(2000);
        deque.add(3000);
        deque.add(4000);
        //print deque
        System.out.println("Deque: " + deque);
        //print head
        System.out.println("Deque's head: " + deque.getLast());


    }
}
