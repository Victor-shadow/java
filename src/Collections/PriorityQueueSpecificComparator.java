package Collections;
import java.util.*;

class The_Comparator implements  Comparator<String>{
    public int compare(String s1 , String s2){
        String firstString;
        String secondString;
        firstString = s1;
        secondString = s2;
        return  secondString.compareTo(firstString);
    }
}
public class PriorityQueueSpecificComparator {
    public static void main(String[]args){
        PriorityQueue<String> queue = new PriorityQueue<>(new The_Comparator());
        queue.add("G");
        queue.add("E");
        queue.add("E");
        queue.add("K");
        queue.add("S");
        queue.add("4");

        System.out.println("The elements with the highest priority element at the front of queue" + "order:");
        while (!queue.isEmpty()){
            System.out.println(" "+ queue.poll());
        }
    }
}
