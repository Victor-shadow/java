//The unmodifiableSortedMap() method in java.util.Collections class is used to return an unmodifiable view of the specified sorted Map
//This method allows modules to provide users with "read-only" access to internal sorted map
//Query Operations on the returned sorted map "read-through" to the specified sorted map.
//Attempts to modify the returned sorted map, whether direct, via its collection views or via its subMap, headMap or tailMap views  will result in an unsupportedOperationException
//The returned sorted map will be serializable if the specified sorted map is serializable

//Syntax:
//public static <K,V>  sortedMap<K,V> unmodifiableSortedMap(SortedMap<K, ? extends V> m)
//Parameters: This method takes the sorted Map as a parameter for which an unmodifiable view is to e returned
//Return value: The method returns an unmodifiable view of the specified sorted map

package Collections;
import java.util.*;

public class CollectionsUnmodifiedSortedMap {
    public static void main(String[]argv) throws Exception{
        try{
            //Create Object of Sorted Map
            SortedMap<String, String> sortmap = new TreeMap<String, String>();
            //populate the map
            sortmap.put("First", "10");
            sortmap.put("Second", "20");
            sortmap.put("Third", "30");
            //Make the map unmodifiable
            Map<String, String> finalmap = Collections.unmodifiableSortedMap(sortmap);
            //Print unmodifiable map
            System.out.println("Unmodifiable map: " + sortmap);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
