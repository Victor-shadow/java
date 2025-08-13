package Collections;
import java.util.*;
public class HashMapValuesMethod {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        //Map values
        hash_map.put("January", 1);
        hash_map.put("February", 2);
        hash_map.put("March", 3);
        hash_map.put("April", 4);
        //Display the HashMap
        System.out.println("Initial hash map: " + hash_map);
        //use values() to get the set view of values
        System.out.println("The collection is: " + hash_map.values());
    }
}
