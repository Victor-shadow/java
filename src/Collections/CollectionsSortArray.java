package Collections;
import java.util.*;
public class CollectionsSortArray {
    public static void main(String[]args){
        //Create an array of String Objects
        String[] domains = {"January", "February", "March","May", "August"};
        //Create a list
        List collectionList = new ArrayList(Arrays.asList(domains));
        //Collections.sort() method is used to sort the list
        Collections.sort(collectionList);
        System.out.println("List after the use of: " + "Collections.sort() :\n" + collectionList);
    }
}

//Arrays.sort() method uses a Dual-Pivot QuickSort Algorithm which gives a time complexity of O(N.log N) which is faster than the traditional
//quick sort Algorithm/
//Collections.sort() creates an array of list elements, sorts them using an Adaptive Merge Sort Algorithm and iterates over the list to position each element at its correct location
//For primitive data types like char, int, double e.t.c Arrays.sort() method is more efficient than Collections.sort() method
