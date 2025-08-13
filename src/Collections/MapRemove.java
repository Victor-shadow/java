/// The map.remove() method is used to remove the mapping for a key from this map if it is present
/// in the map
/// Syntax: V remove(Object key)
/// Parameters: This method has only the argument key, whose mapping is to be removed from the map
/// This method returns the value to which this map previously associated the key, or null if the map
/// contained no mapping for the key
/// Time Complexity: Average Time Complexity of O(1)
/// and worst time complexity of O(n)

package Collections;
import java.util.*;
public class MapRemove {
    public static void main(String[]args){
        //initialize a map of HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        System.out.println(map);

        map.remove(3);

        System.out.println(map);
        //if map does not exist
        //returns null and does not affect the map
        map.remove(2);
        System.out.println(map);
    }
}

//The program demonstrates the use of remove method in the Map Interface using a HashMap
//It initializes a HashMap with integer keys and string values , then removes the entry with key 3
//and attempt to remove a non-existent key 2
//The output shows the map before and after the removals , illustrates how the remove method works
//and that attempting to remove a non-existent key has no effect on the map
