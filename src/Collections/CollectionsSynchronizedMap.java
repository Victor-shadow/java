package Collections;
import java.util.*;

public class CollectionsSynchronizedMap {
    public static void main(String[]argv) throws Exception{
        try{
            //Create Map Object
            Map<String, Boolean> map = new HashMap<String , Boolean>();
            //populate the map
            map.put("Java", true);
            map.put("Kotlin", true);
            map.put("Python", false);
            //print the collection
            System.out.println("Map: " + map);
            //create a synchronized map
            Map<String , Boolean> syncmap = Collections.synchronizedMap(map);
            //Print the synchronized map
            System.out.println("Synchronized Map: " + syncmap);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
