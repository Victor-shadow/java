/// The addAll(Element e) method of AbstractQueue adds all the elements in the specified collection to this queue
/// Syntax; public boolean addAll(Collection c)
/// Parameter: This method accepts a mandatory parameter collection containing elements to be added
/// to this queue
/// Return value: This method returns true if the queue changed as a result of the call
/// Exception: This method throws the following exception
/// i)IllegalStateException: if not all the elements can be added at this time due to insertion restrictions
/// ii)NullPointerException: If the specified collection contains a null element and this queue does not permit null elements
/// or the specified collection is null
/// iii)ClassCastException: if the class of an element of the specified collection prevents it from being added to the
/// queue
/// iv)IllegalArgumentException: if some property of an element of the specified collection prevents it from being added
/// to this queue, or if the specified collection is this queue


package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueAddAll {
    public static void main(String[]args) throws Exception{
        //Create the object of AbstractQueue
        AbstractQueue<Integer> abstractQueue = new LinkedBlockingQueue<Integer>();
        //populate the AbstractQueue
        abstractQueue.add(10);
        abstractQueue.add(20);
        abstractQueue.add(30);
        abstractQueue.add(40);
        abstractQueue.add(50);
       //print abstractQueue
        System.out.println("AbstractQueue contains: " + abstractQueue);

        AbstractQueue<Integer> abstractQueue1 = new LinkedBlockingQueue<Integer>();
        //print AbstractQueue1 initially
        System.out.println("AbstractQueue2 initially contains: " + abstractQueue1);
        //add elements of AbstractQueue to AbstractQueue1
        abstractQueue1.addAll(abstractQueue);

        System.out.println("AbstractQueue1 after addition contains: " + abstractQueue1);

    }
}
