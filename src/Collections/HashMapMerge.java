/// In java, the merge() method of the HashMap class is used to either add  new key-values pairs
/// or update the existing one in the map by merging values using a specific function
/// If the key is not present in the map the merge() method adds the key with the specified value
/// If the key already exists in the map the method uses BIFunction to combine the old value and
/// the new value into one and then updates the key with the combined value
/// Note: It either adds the new entries or updates an existing one by merging values together
///Syntax of HashMap merge() method
/// default V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
///Parameters: This method takes three parameters
/// Key: The key whose value is to be merged
/// Value: The new value to be merged with the existing one
/// remapping Function; It is a function that takes two arguments the current value and the new value and then calculate the new value
/// The return  the new value associated with the key and null if the new value is null
package Collections;
import java.util.*;
public class HashMapMerge {
    public static void main(String[]args){
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Hello");
        hashMap.put("B", "World");
        //use merge for a key that is already present in the map
        hashMap.merge("A", "Java",
                (oldValue,newValue) -> oldValue + " " + newValue);
        //use merge for a key that is not present in the map
        hashMap.merge("C", "Programming", (oldValue, newValue) -> oldValue + newValue);
        System.out.println(hashMap);

    }
}
