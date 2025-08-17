///The replace() method of the HashMap class in Java is used to conditionally replace the values of a specified key if
/// and only if the current value matches the specified old value
/// Syntax of replace (key,oldValue, newValue)
/// boolean replace(K key, V oldValue, V newValue)
/// Parameters:
/// key: The key whose associated value is to be replaced
/// oldValue: The expected current value associated with the key
/// newValue: The new value associated with the key
/// Return Type:
/// The method returns "true" if the value associated with the key is replaced successfully or return "false" if the key does
/// not exist on the map
/// Exception:
/// i)NullPointerException: occurs only if null is used for a key or a value in a map that does not support null
/// ii)IllegalArgumentException: only applies to certain Map implementations(some implementations of ConcurrentHashMap)
package Collections;
import java.util.*;
public class HashMapReplace {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "January");
        hashMap.put(2, "February");
        hashMap.put(3, "March");

        System.out.println("Original map: " + hashMap);
        //replace value for key 2 only if the current value is "February"
        boolean bool = hashMap.replace(2, "February", "April");

        System.out.println("Was the value replaced? " + bool);
        System.out.println("Updated map? " + hashMap);


    }
}
