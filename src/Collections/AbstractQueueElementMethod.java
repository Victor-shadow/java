/// The element() method of AbstractQueue retrieves but does not remove, the head of this queue
/// Syntax: public E element()
/// Parameters: This method does not accept any parameter
/// Return value: This method returns the head of the queue
/// Exception: This method throws NoSuchElementException if the queue is empty

package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class AbstractQueueElementMethod {
    public static void main(String[]args) throws Exception {
        //Create an Object of AbstractQueue
        AbstractQueue<Integer> abstractQueue = new LinkedBlockingDeque<Integer>();
        //populate AQ
        abstractQueue.add(10);
        abstractQueue.add(20);
        abstractQueue.add(30);
        abstractQueue.add(40);
        abstractQueue.add(50);

        //print abstract Queue
        System.out.println("AbstractQueue contains: " + abstractQueue);
        System.out.println("Head: " + abstractQueue.element());

    }
}
