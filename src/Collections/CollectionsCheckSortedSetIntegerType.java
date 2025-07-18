package Collections;
import java.util.*;

public class CollectionsCheckSortedSetIntegerType {
    public static void main(String[]argv) throws Exception{
        try{
            //creating object of sortedSet
            SortedSet<Integer> sset = new TreeSet<Integer>();

            //Adding elements to sset
            sset.add(20);
            sset.add(30);
            sset.add(40);
            sset.add(50);
            //printing the sorted set
            System.out.println("Sorted Set: " + sset);
            //create typesafe view of the specified sorted set using checkedSortedSet() method
            SortedSet<Integer> tset = Collections.checkedSortedSet(sset, Integer.class);
            //print the typesafe view of the specified set
            System.out.println("Typesafe view of the sorted set: " + tset);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        }
    }

}
