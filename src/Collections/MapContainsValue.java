/// The java.util.Map.containsValue() method is used to check whether a particular value being mapped
/// by a single or more than one key in the Map
/// It takes the value as a parameter and returns True if that value is mapped by any of the key in the map
/// Syntax: boolean containsValue(Object value)
/// Parameter: This method just takes one parameter Value of Object type  and refers to the value
/// whose mapping is supposed to be checked by any key inside the map
/// Return value: This method returns boolean true if the mapping of the value is detected else false
package Collections;
import java.util.*;
public class MapContainsValue {
    public static void main(String[]args){
        //Create an Empty Map
        Map<Integer,String> map = new HashMap<Integer, String >();
        //Map String values to int keys
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Coconut");
        map.put(40, "Grapes");
        map.put(50, "Peach");

        //Display the map
        System.out.println("Initial Map: " + map);
        //check for the value "Pineapple"
        System.out.println("Is the value Pineapple present? " + map.containsValue("Pineapple"));
        System.out.println("Is the value of Apple present? " + map.containsValue("Apple"));

    }
}
