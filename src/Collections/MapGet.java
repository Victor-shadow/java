/// Map get method: The get() method of Map interface is used to retrieve or fetch  the value mapped by a particular
/// key mentioned in the parameter
/// It returns null when the map contains no such mapping of the key
/// Syntax : thisMap.get(Object key_element)
/// Parameter: This method takes oe parameter key_element of object type and refers to the key
/// whose associated value is supposed to be fetched
/// The method returns the value associated with the key_element in this Map collection
/// The return type of the get() method depends on the data type or what data types are passed as parameters
/// Case 1; In this case the return type is Integer since the data type initialized in map key value is integer
/// Map<String, Integer> map = new HashMap<>();


package Collections;
import java.util.*;
public class MapGet {
    public static void main(String[]args){
        //Create an Empty Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        //map int values to string
        map.put("January", 10);
        map.put("February", 20);
        map.put("March", 30);
        map.put("April", 40);
        map.put("May", 50);
        //display the map
        System.out.println("Initial map: " + map);
        //Get the value of a particular key
        System.out.println("The value is: " + map.get("January"));
        System.out.println("The Value is: " + map.get("May"));

    }
}
