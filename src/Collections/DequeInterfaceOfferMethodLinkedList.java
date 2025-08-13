/// The offer(E e) method of Deque Interface inserts the specified element into this Deque
/// If it is possible to do so immediately without violating capacity restrictions
/// The method is preferable to add() since this method does not throw any Exception when the capacity of the container
/// is full since it returns false
/// Syntax: boolean offer(E e)
/// Parameters: The method accepts a mandatory parameter e which is the element to be inserted in the Deque
/// Returns: This method returns true on successful insertion else it returns false
/// The function throws the following Exceptions
/// i:ClassCastException -when the class of the element to be entered prevents it from being added to this
/// container
/// ii:IllegalArgumentException - when some property of the element prevents it to be added to the Deque
/// iii:NullPointerException - when the element to be inserted is passed as null and thr Deque interface does not
/// allow null elements

package Collections;

import java.util.Deque;
import java.util.LinkedList;

public class DequeInterfaceOfferMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create object of Deque
        Deque<Integer> deque = new LinkedList<Integer>();
        if (deque.offer(10))
            System.out.println("The deque is not full and 10 is inserted");
        else
            System.out.println("The Deque is full");
        if (deque.offer(15))
            System.out.println("The deque is not full and 15 is inserted");
        else
            System.out.println("The Deque is full");
        if (deque.offer(20))
            System.out.println("The deque is not full and 20 is inserted");
        else
            System.out.println("The deque is full");
        if (deque.offer(25))
            System.out.println("The deque is not full and 25 is inserted");
        else
            System.out.println("The deque is full");
        //print the deque
        System.out.println("Deque: " + deque);


    }
}
