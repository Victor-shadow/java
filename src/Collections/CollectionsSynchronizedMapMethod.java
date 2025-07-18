//The synchronizedMap() method of Java.util.Collections class  is used to return a synchronized(Thread-safe) map backed by the specified map
//In order to guarantee serial access, it is critical that all access to the backing map is accomplished through a returned map
//Syntax:
//public static<K, V> Map<K,V> synchronizedMap<K,V>m)
//Parameters: This method takes the map as a parameter to be "wrapped" in a synchronized map
//Return value: The method returns a synchronized view of the specified map

package Collections;
import java.util.*;
import java.util.HashMap;

public class CollectionsSynchronizedMapMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of Map
            Map<String, String> map = new HashMap<String, String >();
            //populate the map
            map.put("Value 1", "10");
            map.put("Value 2", "20");
            map.put("Value 3", "30");
            map.put("Value 4", "40");
            //print  the collection
           System.out.println("Map: " + map);
           //Create a Synchronized Map
            Map<String, String> syncmap = Collections.synchronizedMap(map);
            //print the collection
            System.out.println("Synchronized Map: " + syncmap);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
