package Collections;

import java.util.*;
class QueueInterfacePriorityQueue {
    public static void main(String[]args){
        //Create an empty priorityQueue
        Queue<Integer> queue = new PriorityQueue<>();
        //add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        //print the top element of the PQ
        System.out.println(queue.peek());
        //print the top element and remove it from the priorityQueue container
        System.out.println(queue.poll());
        //print the top element
        System.out.println(queue.peek());
    }
}
