/// The java.util.Map.entrySet() method in Java is used to create a set out of the same elements
/// contained in the map
/// It basically returns a set view of the map or one can create a new set and store map elements inside them
/// Syntax: map.entrySet()
/// Parameter: This method does not accept any parameter
/// Return value: This method returns a set having the same elements as hash map


package Collections;
import java.util.*;
public class MapEntrySet {
    public static void main(String[]args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //Map String values to int keys
        map.put(100, "January");
        map.put(200, "February");
        map.put(300, "March");
        map.put(400, "April");
        map.put(500, "May");
        //Display the Map
        System.out.println("Initial map is: " + map);
        //use entrySet() to get the set view
        System.out.println("Entry set view: " + map.entrySet());

    }
}
