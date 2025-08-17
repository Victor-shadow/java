/// In java, the computeIfAbsent() method of the HashMap class is used to compute and insert a value
/// for a specific key to a HashMap only if the key does not already have a value
/// Syntax: public V computeIfAbsent(K key, Function mappingFunction)
/// Parameters: key:The key whose associated value is to be calculated
/// mappingFunction:It is a function that computes the value if the key is not present
/// Return type:
/// If the key is present, then it returns the existing value
/// If the key is not present, then it calculates the value using mappingFunction and then returns the calculated value
/// Note: If a remapping function returns null for a key, then no mapping is recorded for that key
/// At the time of computation, if remapping function throws an Exception, the exception is rethrown, and no mapping
/// is recorded
/// This method will throw A ConcurrentModificationException if the remapping function modified this map during computation
package Collections;
import java.util.*;
public class HashMapComputeIfAbsentMethod {
    public static void main(String[]args){
        HashMap<String, Integer> hashMap = new HashMap<>();
        //add initial values to the map
        hashMap.put("A", 1);
        hashMap.put("B", 2);

        System.out.println("Initial map: " + hashMap);
        //use computeIfAbsent() method
        Integer i = hashMap.computeIfAbsent("C", key -> key.length());
        Integer j = hashMap.computeIfAbsent("A", key -> key.length());

        //the key c is not present in the map, hence the value is computed
        System.out.println("The Value for C: " + i);
        //the key a is present in the map, the value is not recomputed
        System.out.println("Value for A: " + j);
        System.out.println("Updated Map: " + hashMap);
    }
}
