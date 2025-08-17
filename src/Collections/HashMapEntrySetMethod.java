/// The entrySet() method of the HashMap class in Java is used to create a set view of the mappings containeed
/// in the HashMap
/// The method allows one to iterate over a key-value pair in the map and convert them into a set
/// Syntax: public Set<Map.Entry<K, V>> entrySet()
/// Parameter; The method does not take any parameter
/// Return value: The method returns a set having the same elements as the HashMap


package Collections;
import java.util.*;
public class HashMapEntrySetMethod {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        //map String values to integer keys
        hashMap.put(10, "Java");
        hashMap.put(20, "Kotlin");
        hashMap.put(30, "Scala");
        hashMap.put(40, "Python");
        hashMap.put(50, "Javascript");

        //display the HashMap
        System.out.println("Initial mappings: " + hashMap);
        //use entrySet() to get the set view
        System.out.println("The set is: " + hashMap.entrySet());
    }

}
