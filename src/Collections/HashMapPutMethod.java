/// The put() method of java HashMap class is used to add or update the key-value pairs in the map
/// If the key already exists in the map, the previous value associated with the key is replaced by the new value
/// and if the key does not exist, the new key-value pair is added to the map
/// Syntax: public V put(K Key, V Value)
/// Parameters:
/// Key: The key with which the specified value is associated
/// Value: The value to be associated with the specified key
/// Return Types: If we add a duplicate key, the value associated with that key gets updated and the previous value is replaced
/// When a new key is passed to the put() method , it is added to the map and the map returns null


package Collections;
import java.util.*;
public class HashMapPutMethod {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        //add key-value pairs
        hashMap.put("Java",1);
        hashMap.put("Kotlin",2);
        hashMap.put("Scala",3);

        System.out.println("HashMap: " + hashMap);


    }
}
