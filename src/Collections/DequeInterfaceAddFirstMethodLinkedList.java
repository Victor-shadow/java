/// The addFirst(E e) method of Deque interface inserts the elements passed in the parameter
/// to front of the Deque if there is space
/// If the Deque is capacity restricted  and no space is left for insertion, it returns IllegalStateException
/// The function returns true on successful insertion
/// Syntax: void addFirst(E e)
/// Parameters: This method accepts mandatory parameters e which is the element to be inserted to the front of the Deque
/// This method returns true on successful insertion
/// Exception: The function throws the following exceptions:
/// ClassCastException: where the class of the element to be entered prevents it from being added to this container
/// IllegalStateException: when the capacity of the container is full and insertion is done
/// IllegalArgumentException: when some property of the element prevents it to be added to the queue
/// NullPointerException: when the element to be inserted is passed as null and the Deque interface does not allow
/// null elements


package Collections;
import java.util.*;
public class DequeInterfaceAddFirstMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //create object of deque
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the deque
        deque.addFirst(1000);
        deque.addFirst(2000);
        deque.addFirst(3000);
        deque.addFirst(4000);
        //print deque
        System.out.println("Deque: " + deque);

    }
}
