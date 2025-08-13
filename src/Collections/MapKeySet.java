/// This method is used to return a Set view of the keys contained in this map
/// The set is backed by the map, so changes in the map are reflected in the set and vice versa
///Syntax: Set keySet()
/// Parameters: This method has no argument
/// This method returns a set containing keys of the specified map

package Collections;
import java.util.*;
public class MapKeySet {
    public static void main(String[]args){
        //Initialize a map of type HashMap
        Map<String,String> map = new HashMap<>();
        //add elements in the map
        map.put("1", "One");
        map.put("2", "Two");
        //print the key set
        System.out.println(map.keySet());


    }
}
