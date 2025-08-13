package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceIteratorMethodLinkedBlockingQueue {
    public static void main(String[]args) throws IllegalStateException{
        //Create Object of Deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers to the end of the Deque
        deque.add(1000);
        deque.add(2000);
        deque.add(3000);
        deque.add(4000);
        //call iterator method
        Iterator iterator = deque.iterator();
        //print elements of the Iterator
        //created from the Deque
        System.out.println("The iterator values" + " of Deque are:");
        //prints the elements using an iterator
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
