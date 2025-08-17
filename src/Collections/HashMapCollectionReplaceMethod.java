/// The replace() method of the HashMap class in Java is used to replace the value associated with a specific key if the key
/// is already present in the map
/// Note: If the key does not exist, the method does nothing, and the map remains unchanged
///Syntax:
/// public V replace(K Key, V newValue)
/// Parameter: Key: The key whose associated value is to be replaced
/// Value: The new value to associate  with the specified key
/// Return Value: This method returns the old value associated  with the key or returns null if the key does not
/// exist in the map
package Collections;
import java.util.*;
public class HashMapCollectionReplaceMethod {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Kotlin");

        System.out.println("Original HashMap: " + hashMap);

        //try to replace value for
        //a non existing key(key 2)
        String oldValue = hashMap.replace(2, "Rust");
        System.out.println("Replaced value: " + oldValue);
        System.out.println("Updated HashMap: " + hashMap);
    }
}
