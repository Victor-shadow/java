package Collections;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsSynchronizedSortedSetForIntegerValue {
    public static void main(String[]argv) throws Exception{
        try{
            SortedSet<Integer> set = new TreeSet<Integer>();
            //populate the set
            set.add(10);
            set.add(20);
            set.add(30);
            set.add(40);
            set.add(50);
            //print the collection
            System.out.println("Sorted Set: " + set);
            //Create a synchronized sorted set
            SortedSet<Integer> sorset = Collections.synchronizedSortedSet(set);
            //print the set
            System.out.println("Sorted set is: " + sorset);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
