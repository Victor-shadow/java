//The synchronizedSoredSet() method of java.util.Collections class is used to return a synchronized(thread-safe) sorted set backed up by the specified
//sorted set
//In order to guarantee serial access, it is critical that all access to the backing sorted set is accomplished through the returned sorted set
//(or its views)
//Syntax:
//public static <T> SortedSet<T> synchronizedSortedSet(SortedSet<T> s)
//Parameters: This method takes the sorted set as a parameter to be "wrapped" in a synchronized sorted set.
//Return value: This method returns a synchronized view of the specified sorted set
package Collections;
import java.util.*;

public class CollectionsSynchronizedSortedSet {
    public static void main(String[]argv) throws Exception{
        try{
            SortedSet<String> set = new TreeSet<String >();
            //populate the set
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("D");
            set.add("E");
            //PRINT THE COLLECTION
            System.out.println("Sorted Set: " + set);
            //Create a SynchronizedSorted Set
            SortedSet<String > sortset = Collections.synchronizedSortedSet(set);
            //print the set
            System.out.println("Sorted set is: " + sortset);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
