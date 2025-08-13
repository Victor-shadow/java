/// The java.util.Map.clear() method in Java is used to clear and remove all the elements or mappings
/// from a specified mapping collection
/// Syntax: void clear();
///Parameters: This method does not accept any parameters
/// Return value: This method does not return any value


package Collections;
import java.util.*;
public class MapClear {
    public static void main(String[]args){
        //Create an Empty map
        Map<Integer, String> map = new HashMap<Integer, String>();
        //Map String values into integer keys
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        map.put(4, "April");
        map.put(5, "May");
        //display the map
        System.out.println("Initial maps are: " + map);
        //clear the map
        map.clear();
        //Display the Final HashMap
        System.out.println("Final map: " + map);

    }
}
