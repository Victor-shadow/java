/// This method is used to check if a map is having an entry for key and value pairs
/// If no mapping exists then this returns false
/// Syntax: boolean isEmpty()
/// Parameter: This method has no argument
/// Return Value: This method returns true if the map does not contain any key-value mapping


package Collections;
import java.util.*;
public class MapIsEmpty {
    public static void main(String[]args){
        //Initialize a map of type HashMap
        Map<String, String> map = new HashMap<>();
        System.out.println(map);
        System.out.println(map.isEmpty());
    }
}
