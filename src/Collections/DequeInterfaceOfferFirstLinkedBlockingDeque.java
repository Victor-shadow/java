/// The offerFirst(E e) method of Deque Interface inserts the specified element into the front of the Deque
/// if it is possible to do so immediately  without violating capacity restriction
/// This method is preferable to addFirst() method since this method does not throw an Exception when the capacity
/// of the container is full
/// Syntax: boolean offerFirst(E e)
/// Parameters: This method accepts a mandatory parameter e which is the element to be inserted
/// in the front of the Deque
/// Returns: This method returns true after successful insertion else it returns false
/// Exception: The function throws the following Exception
/// i: ClassCastException: when the class of the element to be entered prevents it from being added to the container
/// ii: IllegalArgumentException: when some property of the element prevents it from being added to the Deque
/// iii: NullPointerException: when the element to be inserted is passed as null and the Deque does not allow null elements
package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceOfferFirstLinkedBlockingDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create object of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>(3);

        if (deque.offerFirst(10))
            System.out.println("The Deque is not full and 10 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerFirst(20))
            System.out.println("The deque is not full and 20 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerFirst(30))
            System.out.println("The deque is not full and 30 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerFirst(40))
            System.out.println("The deque is not full and 40 is inserted");
        else
            System.out.println("The deque is full");
        //print value
        System.out.println("Deque: " + deque);


    }
}
