/// The java.util.Map.containsKey() method is used to check whether a particular key is being mapped
/// into the map or not
/// It takes the key element  as a parameter and returns true if that element is mapped in the Map
/// Syntax: boolean containsKey(key_element)
/// Parameters: This method takes just one parameter key_element that refers to the key whose mapping
/// is supposed to be checked inside the map
/// Return value: This method returns boolean true if the presence of the key is detected else false



package Collections;
import java.util.*;
public class MapContainsKey {
    public static void main(String[]args){
        //Create an Empty Map
        Map<Integer, String>map = new HashMap<Integer, String>();
        //map string values to int keys
        map.put(1, "Django");
        map.put(2, "Spring");
        map.put(3, "Flask");
        map.put(4, "Hibernate");
        map.put(5, "React");

        //display the map
        System.out.println("Initial map: " + map);
        //check for the key element 2
        System.out.println("Is the key 2 present? " + map.containsKey(2));
        //check for the key element 7
        System.out.println("Is the key 7 present? " + map.containsKey(7));

    }
}
