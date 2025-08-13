/// The putIfAbsent() method of the HashMap class in Java is used to insert a key-value pair
/// into the map only if the key is not present in the map
/// or is mapped to null
/// The existing value remains unchanged if the key is already associated with a value
/// Syntax of putIfAbsent() ; default V putIfAbsent(K, key, V value)
/// V: The return type of the method. It represents the type of value associated with the key of the HashMap
/// Parameters: key: The key with which the specified value is to be associated
/// value: The value to be associated with the specified key
/// Return Type: The method returns previous value associated with the specified key or return null
/// if there was no mapping for the key.
/// Note: This method does not overwrite existing mappings
/// If the key is mapped null a new value is inserted
/// Returns null if the key were absent, otherwise returns the existing values
package Collections;
import java.util.*;
public class HashMapPutIfAbsent {
    public static void main(String[]args){
        //Create a HashMap and add some value
        //including a null value
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 100);
        hashMap.put("B", 200);
        hashMap.put("C", null);
        //display the original map
        System.out.println("Original HashMap: " + hashMap);
        //Insert a value for a key that is not present
        Integer resource1 = hashMap.putIfAbsent("D", 400);
        //Insert a value for a key that is mapped to null
        Integer resource2 = hashMap.putIfAbsent("C", 300);
        //Attempt to insert a value for an existing key
        Integer resource3 = hashMap.putIfAbsent("A", 500);
        System.out.println("Result for Key D(absent): " + resource1);
        System.out.println("Result for key C(null): " + resource2);
        System.out.println("Result for key A(existing): " + resource3 );
        System.out.println("Hashmap: " + hashMap);



    }

}
