/// The iterator() method of the Deque Interface returns an iterator over the elements in the deque
/// in a proper sequence
/// The elements will be returned in order from first(head) to last(tail)
/// The returned iterator is a "weakly consistent" iterator
/// Syntax: Iterator iterator()
/// Parameters: This method does not accept any parameter
/// This method returns an iterator over the elements in this deque in the proper sequence

package Collections;
import java.util.*;
public class DequeInterfaceIteratorMethodArrayDeque {
    public static void main(String[]args) throws IllegalStateException{
        //Create a Deque Object
        Deque<Integer> deque = new ArrayDeque<Integer>();
        //add numbers to the end of the deque
        deque.add(111111);
        deque.add(222222);
        deque.add(333333);
        deque.add(444444);
        //Call Iterator method of Deque
        Iterator iterator = deque.iterator();
        //print elements of the iterator
        //created from the Deque
        System.out.println("The Iterator values" + " of Deque are:");
        //print the elements using an Iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
