/// The method putAll() is used to copy all the mappings from the specified map to this map
/// Syntax: void putAll(Map m)
/// Parameters: This method has the only argument map m which contains key-value mappings to be copied to a given map
/// Returns: This method returns the previous value associated with the key if present else returns -1


package Collections;
import java.util.*;
public class MapPutAll {
    public static void main(String[]args){
        //Initialize a map of type HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "nine");
        System.out.println(map);

        Map<Integer, String > map1 = new HashMap<>();
        map1.put(10, "Ten");
        map1.put(30, "Thirty");
        map1.put(50, "Fifty");

        map.putAll(map1);
        System.out.println(map);

    }
}
