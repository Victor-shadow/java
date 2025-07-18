package Collections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;
//The asLifoQueue() method of java.util.Collections class is used to return the view of the Deque as a
//Last-In-First-out queue.
//Method add is mapped to push, remove is mapped to pop
//Syntax:
//public static Queue asLifoQueue(Deque deque)
//Parameter: This method takes deque as a parameter which is to be converted to LifoDeque
//Return Value: This method returns a LifoQueue from the deque
//Each method invoked on the queue returned by this method results exactly in one method invoked on the backing deque with one exception
//=The addAll() method is implemented as a sequence of addFirst invocations on backing deque

public class AsLifoQueueMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Creating Object of Deque
            Deque<String>  deque = new ArrayDeque<String>(1);
            //Adding elements to Deque
            deque.add("Summer");
            deque.add("Autumn");
            deque.add("Spring");
            //get queue from deque  using asLifoQueueMethod()
            Queue<String> nq = Collections.asLifoQueue(deque);
            //Print the queue
            System.out.println("View of the queue is: " + nq);
        }
        catch (IllegalArgumentException e){
            System.out.print("Exception thrown: " + e);
        }
    }
}
