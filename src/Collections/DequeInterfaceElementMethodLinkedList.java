/// The element() method of the Deque Interface returns the element at the front of the container
/// It does not delete the element in the container
/// This method returns the head of the deque
/// The method throws an exception when the deque is empty
/// Syntax E element
/// Parameter: This method does not accept any parameter
/// Returns: This method returns the element at the front of the container or the head of the Deque
/// The function throws NoSuchElementException when the deque is empty and the function is called

package Collections;
import java.util.*;
public class DequeInterfaceElementMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the deque
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        //print the deque
        System.out.println("Deque: " + deque);
        //print head of deque
        System.out.println("Deque's head: " + deque.element());

    }
}
