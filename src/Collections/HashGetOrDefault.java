/// This method getOrDefault(Object key, V, defaultValue) retrieves the value associated with a given key
/// if it exists in a given map
/// If the key does not exist, it returns a default value provided by the user
///
/// Syntax of getOrDefault()Method
/// public V getOrDefault(Object key, V defaultValue)
/// V: It represents the type of value that the map holds
/// It is a generic type, and it will match the type of values in the HashMap
/// Parameters:
/// key: The key whose associated value is to be returned
/// defaultValue: The value to return if the specified key  is not present in the map


package Collections;
import java.util.*;
public class HashGetOrDefault {
    public static void main(String[]args){
         //Create a HashMap and add a key-value pairs
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 1);
        hashMap.put("Kotlin", 2);
        //key "Java" exists
        //so its associated value is returned
        int a = hashMap.getOrDefault("Java", 0);
        System.out.println("Value for Java: " + a);
    }
}
