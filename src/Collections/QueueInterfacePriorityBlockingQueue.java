package Collections;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

class QueueInterfacePriorityBlockingQueue {
    public static void main(String[]args){
        //Create an empty PriorityBlockingQueue
        Queue<Integer> pbq =new PriorityBlockingQueue<Integer>();
        //add items into the pbq using add() method
        pbq.add(100);
        pbq.add(200);
        pbq.add(300);

        //print the top element of the PriorityBlockingQueue
        System.out.println(pbq.peek());
        //print the top element and removing it from the queue
        System.out.println(pbq.poll());
        //print the top element
        System.out.println(pbq.peek());
    }
}
