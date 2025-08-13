///The add(E e) method of Deque Interface inserts the elements passed in the parameter to the end of the Deque
/// if there is space
/// If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException
/// The function returns true on successful insertion
/// Syntax; boolean add(E e)
/// Parameters: This method accepts a mandatory parameter e which is the element to be inserted at the end of the Deque
/// Returns: This method returns true on successful insertion
/// Exceptions: This function throws four exceptions:
/// i) ClassCastException: when the class of the element to be entered prevents it from being added to the container
/// ii)IllegalStateException: when the capacity of the container is full and insertion is done
/// iii) IllegalArgumentException: when some property of the element prevents it from being added to the deque
/// iv)NullPointerException: when the element to be inserted is passed as null and the Deque interface does not allow
/// null elements
package Collections;
import java.util.*;
public class DequeInterfaceAddMethodLinkedList {
    public static void main(String[]args) throws IllegalStateException{
        //Create Object of Deque
        Deque<Integer> deque = new LinkedList<Integer>();
        //add numbers to the end of the Deque
        deque.add(111111);
        deque.add(222222);
        deque.add(333333);
        deque.add(444444);
        //print the deque before removal
        System.out.println("Deque: " + deque);



    }
}
