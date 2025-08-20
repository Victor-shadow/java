package Collections;
import java.io.PrintStream;
import java.util.*;

public class PriorityQueueRemoveMethod {
    //main driver method
    public static void main(String[]args){
        //Create an empty PriorityQueue by
        //creating an object of Integer type
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        //add custom input elements using add() method
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        //display the PriorityQueue
        System.out.println("Initial PriorityQueue: " + queue);
        //remove elements from the PriorityQueue
        queue.remove(50);
        queue.remove(40);

        System.out.println("PriorityQueue after removing " + "elements: " + queue);

    }
}
//this class also implements the AbstractQueue Interface
