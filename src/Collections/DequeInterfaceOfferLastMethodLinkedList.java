/// The offerLast(E e) method of Deque Interface inserts the specified element  into the end of the Deque
/// if it is possible to do so immediately  without violating capacity restrictions
/// The method is preferable to add method() since this method does not throw an Exception when the capacity of the container
/// is full since it returns false
/// Syntax: boolean offerLast()
/// Parameters: This method offers a mandatory parameter e which is the element to be inserted in the end of the Deque
/// Returns: This method returns true on successful insertion otherwise it returns false
/// Exceptions: THE function throws three Exceptions:
/// i: ClassCastException: when the class of the element to be entered prevents it from being added
/// to the container
/// ii: IllegalArgumentException: when some property of the element prevents it from being added to the Deque
/// iii: NullPointerException: when the element to be inserted is passed as null and the Deque interface does not allow null
/// elements


package Collections;
import java.util.*;
public class DequeInterfaceOfferLastMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create Deque Object
        Deque<Integer> deque = new LinkedList<Integer>();
        if (deque.offerLast(10))
            System.out.println("The Deque is not full and 10 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(20))
            System.out.println("The deque is not full and 20 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(30))
            System.out.println("The deque is not full and 30 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offerLast(40))
            System.out.println("The deque is not full and 40 is inserted");
        else
            System.out.println("The deque is full");
        //print Deque
        System.out.println("Deque: " + deque);

    }
}
