package Collections;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class CollectionsSynchronizedSortedMapForIntegerAndBoolean {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of SortedMap
            SortedMap<Integer, Boolean> map = new TreeMap<Integer, Boolean>();
            //populate the map
            map.put(100, true);
            map.put(200, true);
            map.put(300, true);
            map.put(400, false);
            //print the collection
            System.out.println("Sorted Map: " + map);
            //create a sorted map
            SortedMap<Integer, Boolean> sortedmap = Collections.synchronizedSortedMap(map);
            //print the map
            System.out.println("Synchronized sorted map is: " + sortedmap);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
