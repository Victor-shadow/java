package Collections;
import java.util.*;
public class QueueInterfaceOperationsInteger {
    public static void main(String[]args){
        Queue<Integer> queue = new LinkedList<>();
        //add elements {1, 2, 3, 4, 5}
        for (int i = 0; i < 5; i++)
            queue.add(i);
        //display the contents of the Queue
        System.out.println("Elements of the Queue: " + queue);
        //to remove the head of the queue
        int remove = queue.remove();
        System.out.println("Removed element: " +remove);
        System.out.println(queue);
        //to view the head of the queue
        int head = queue.peek();
        System.out.println("Head of the Queue: " + head);
        //rest of all the methods of the collection interface
        int size = queue.size();
        System.out.println("Size of the queue: " + size);


    }
}
