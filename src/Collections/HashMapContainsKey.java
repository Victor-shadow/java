package Collections;
import java.util.*;
public class HashMapContainsKey {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();
        //map int values to string keys
        hash_map.put("Golang", 10);
        hash_map.put("4", 15);
        hash_map.put("Go", 20);
        hash_map.put("W", 25);
        hash_map.put("Y", 30);
        //display the HashMap
        System.out.println("Initial mappings: " + hash_map);
       //check for the element 'W'
        System.out.println("Is the key 'W' present? " + hash_map.containsKey("W"));
        //check for the element 'Kotlin'
        System.out.println("Is the key 'Kotlin' present? " + hash_map.containsKey("Kotlin"));
    }
}
//The same operation can be performed with any type of Mappings with variation and combination of different data types
//Time Complexity
//The Time Complexity of HashMap.containsKey() is O(1) in Average case and O(n) worst case