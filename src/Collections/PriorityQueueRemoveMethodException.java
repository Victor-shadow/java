package Collections;
import java.util.*;
//Main class: PriorityQueue Exception
class PriorityQueueRemoveMethodException {
    //main driver method
    public static void main(String[]args){
        //create an Empty PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        //elements are inserted in an Unsorted Order in a PriorityQueue,
        //but after removal of elements the Queue is sorted
        //add elements into the priority queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(40);
        priorityQueue.add(50);
        //elements in the queue are unsorted
        //to Get the size of the Queue before deletion
        //of any element using size() method
        System.out.println("Size of the priorityQueue before deletion : " + priorityQueue.size());
        //print the elements of the queue
        System.out.println("PriorityQueue before removal : " + priorityQueue);
        //call remove() method over priorityQueue
        //in which there are 5 elements
        //Here, calling remove() method say be it two times
        //so two top priority elements will be removed
        System.out.println(" 1st element removed: " + priorityQueue.remove());
        System.out.println(" 2nd element removed: " + priorityQueue.remove());
        System.out.println(" 3rd element removed: " + priorityQueue.remove());
        System.out.println(" 4th element removed: " + priorityQueue.remove());
        System.out.println(" 5th element removed: " + priorityQueue.remove());

        //By now the queue is empty and, if now we made further
        //remove() call it will throw an exception for this
        System.out.println(" 6th element removed: " + priorityQueue.remove());
        //printing the queue after removal of priority elements
        System.out.println("Priority queue after removal as follows: " + priorityQueue);
    }
}
//There are no further elements in the queue, as the queue is empty now, so it throws NoSuchElementException