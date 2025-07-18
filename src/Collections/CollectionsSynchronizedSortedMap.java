//The synchronizedSortedMap() method of java.util.Collections class is used to return a synchronized(thread-safe)
//sorted map backed by the specified sorted map
//In order to guarantee serial access, it is critical that all access to the backing sorted map is accomplished through the returned
//sorted map
//Syntax:
//public static <K,V>  SortedMap<K,V> synchronizedSortedMap(SortedMapK, V>, m)
//parameters: This method takes the sorted map as a parameter to be "wrapped" in a synchronized sorted map
//Return value: This method returns a synchronized view of the specified sorted map
package Collections;
import java.util.*;

public class CollectionsSynchronizedSortedMap {
    public static void main(String[] argv) throws Exception{
        try{
            //Create object of SortedMap
            SortedMap<String , String > map = new TreeMap<String , String >();
            //populate the map
            map.put("1", "A");
            map.put("2", "B");
            map.put("3", "C");
            map.put("4", "D");

            //print the collection
            System.out.println("Sorted Map: " + map);
            //Create a sorted Map
            SortedMap<String, String> sortedmap = Collections.synchronizedSortedMap(map);
            //Print the map
            System.out.println("Synchronized sorted map: " + sortedmap);
        }
        catch (IllegalArgumentException e){
                System.out.println("Exception thrown: "  + e);
    }
    }

}
