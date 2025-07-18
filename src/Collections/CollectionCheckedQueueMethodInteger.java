package Collections;
import java.util.*;


public class CollectionCheckedQueueMethodInteger {
    public static void main(String[]args){
        //Create a queue
        Queue<Integer> data = new PriorityQueue<Integer>();
        //Add Elements
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        //Create type safe view of the list
        System.out.println(Collections.checkedQueue(data, Integer.class));

    }
}
