/// The compute(Key BiFunction) method of the HashMap class in Java is used to update or compute the value
/// for a specific key
/// It tries to compute a mapping for a specified key and its current mapped value(or null if there is no current mapping)
/// If the remapping function passed to compute()  returns null, the mapping is removed from the HashMap(or remains absent if initially absent)
/// The method is useful when one needs to automatically update the value for a given key in the Map
///Syntax of HashMap compute() method
/// default V
/// compute(K key, BiFunction<?super K, ?superV, ?
/// extends V>remapping Function)
/// Parameters:
/// key- The key for which the value is to be computed
/// remappingFunction - A function that computes the value for the specified key
/// Returns : The new value associated with the specified key, or null if there are none
/// Exceptions
/// NullPointerException:If the key is null, and the map does not support null keys or the remapping Function is null
/// UnsupportedOperationException: If the put operation is not supported by the map
/// ClassCastException: If the class of the key or value prevents it from being stored in the map
/// IllegalArgumentException: If some property  of the key or value prevents it from being stored
/// in this map
/// Note:
/// i)if the remapping function passed in compute returns null, the mapping is removed from the Map(or remains absent if initially absent)
/// If the remapping function throws an Exception, the exception is re-thrown, and the current mapping is left
/// unchanged
/// During computation, remapping function should not be able to modify this map, The compute method can be used to update an
/// existing value inside HashMap. 'i.e.'
/// Mapping to increment an int value of mapping:
/// map.compute(Key, (k, v) -> (v == null) ? 1: v+ 1)
///The default implementation of this method takes no guarantee for detecting an error if the remapping function of compute() method
/// modifies the map during computation
package Collections;
import java.util.*;
public class HashMapComputeMethod {
    public static void main(String[]args){
        //create a map and add some values
        Map<String, String> map = new HashMap<>();
        map.put("Language", "Java");
        map.put("Developer", "James");
        //print the map
        System.out.println("Map: " + map);
        //Remap values using compute method
        map.compute("Language", (key, value) -> value.concat("Programming"));
        map.compute("Developer", (key, value) -> value.concat("Goosing"));
        //print new mapping
        System.out.println("New Map: " + map);
    }

}
