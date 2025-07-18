package Collections;
import java.util.*;

public class CollectionsBinarySearchDescendingOrder {
    public static void main(String[]args){
        List<Integer> array = new ArrayList<Integer>();
        array.add(100);
        array.add(50);
        array.add(30);
        array.add(10);
        array.add(2);
        //The last parameter specifies the comparator method used for sorting
        int index = Collections.binarySearch(array, 50, Collections.reverseOrder());
        System.out.println("Found at index " + index);
    }

}
