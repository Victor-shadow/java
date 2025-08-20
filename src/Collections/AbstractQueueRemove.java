/// The remove() method of the AbstractQueue returns and removes the head of this queue
/// Syntax: public E remove()
///Parameters: This method does not accept any parameters
/// Return value: The method returns the head of the queue
/// Exceptions: This function throws NoSuchElementException if the queue is empty

package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueueRemove {
    public static void main(String[]args) throws Exception{
        //Create an Object of AbstractQueue
        AbstractQueue<Integer> abstractQueue = new LinkedBlockingQueue<Integer>();
        //populate the abstract queue
        abstractQueue.add(10);
        abstractQueue.add(20);
        abstractQueue.add(30);
        abstractQueue.add(40);
        abstractQueue.add(50);

        //print AbstractQueue
        System.out.println("AbstractQueue contains: " + abstractQueue);
        //retrieve the head
        int head = abstractQueue.remove();
        System.out.println("head: " + head);

        //print AbstractQueue
        System.out.println("AbstractQueue after removal of head: " + abstractQueue);


    }
}
