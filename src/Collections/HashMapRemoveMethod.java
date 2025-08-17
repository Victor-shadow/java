/// The remove() method of the Java HashMap class is used to remove the key-value pair
/// from the map based on the given key
/// If the key is found, the mapping associated with the key is returned, otherwise it returns null
/// Syntax of HashMap remove() method
/// Removes the key-value pair for the specified key
/// Value remove(Object Key)
/// Removes the key-value pair if the key exists and the value matches exactly
/// boolean remove(Object key, Object value)
/// Parameters: Object key: The key whose mapping one wants to remove
/// Object value: The value expected to be associated  with the specified key
/// Return value:
/// Returns the value associated with the specified key
/// Returns null if the key does not exist in the HashMap
/// Returns true if the key-value pair is removed, otherwise it returns false


package Collections;
import java.util.*;
public class HashMapRemoveMethod {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        //add elements
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, "Python");

        System.out.println("Original HashMap: " + hashMap);
        //remove an element
        String remove = hashMap.remove(2);
        //Display the removed() value and Hashmap after removal
        System.out.println("Removed value: " + remove);
        System.out.println("HashMap after removal: " + hashMap);


    }
}
