/// In Java, the computeIfPresent() method of the HashMap class is used to compute a new value for a specified
/// key if the key is already present in the map and its value is not null
/// If the key is not present, no action is taken
/// Syntax of ComputeIfPresent:
/// default V computeIfPresent(K Key, BiFunction<?super K, ?super V, ? extends V> remappingFunction)
/// Parameter: The key whose presence in the map is to be tested
/// BiFunction: A function to compute a new value for the given key
/// Return value: The new value associated with the key, or null if the key was removed


package Collections;
import java.util.*;
public class HashMapComputeIfPresentMethod {
    public static void main(String[]args){
        //Create a HashMap and some values
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Kotlin", 20);
        map.put("Scala", 30);
        //print HashMap
        System.out.println("HashMap before operation :\n" + map);
        //update value for key "Java" using computeIfPresent
        map.computeIfPresent("Java", (key, value) -> value + 100);
        //print the new mapping
        System.out.println("HashMap after operation: \n" + map);

    }
}
