/// The addLast(E e) method of Deque Interface inserts the element passed in the parameter to the end of the Deque
/// if there is space
/// If the deque is capacity restricted, and no space is left for insertion, then a IllegalStateException is returned
/// The function returns true on successful insertion
/// Syntax: boolean addLast(E e)
/// Parameters: This method accepts a mandatory parameter e which is the element to be inserted at the end of the deque
/// Return value:This method returns true on successful insertion
/// Exception: The method throws the following Exceptions:
/// i ClassCastException: when the class of the element to be entered prevents it from being added to this container
/// ii IllegalStateException: when the capacity of the container is full and insertion is done
/// iii IllegalArgumentException: when some property of the element prevents it from being added to the Deque
/// iv NullPointerException: when the element  to be inserted is passed as null, and the Deque interface does not allow
/// any null elements
package Collections;
import java.util.*;
public class DequeInterfaceAddLastMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
      //Create object of Deque
        Deque<Integer> deque =new LinkedList<Integer>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        //print the deque
        System.out.println("Deque: " + deque);
    }
}
