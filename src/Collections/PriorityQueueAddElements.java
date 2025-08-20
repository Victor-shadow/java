/// To add an element in a priorityQueue, we can use the add() method
/// The insertion order is not retained in the PriorityQueue. The elements are stored based on their
/// priority order, which is ascending by default


package Collections;
import java.util.*;
public class PriorityQueueAddElements {
    public static void main(String[]args){
        //Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 3; i++){
            priorityQueue.add(i);
            priorityQueue.add(1);
        }
        System.out.println(priorityQueue);
    }
}
//TimeComplexity: O(log n)
//Space Complexity: O(n) where n is the number of elements in the priorityQueue
//Note: We don't get sorted elements by printing PriorityQueue