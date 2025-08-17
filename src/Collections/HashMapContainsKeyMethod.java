/// The java.util.HashMap.containsKey() method is used to check whether a particular key is being mapped
/// into the HashMap or not
///It takes the key element as a parameter, and returns True if the element is mapped in the map
/// Syntax: HashMap.containsKey(key_element)
/// Parameter: this method just takes one parameter, key_element that refers to the key whose mapping is supposed
/// to be checked inside the map
/// Return value: This method returns boolean true, if the presence of the key is detected or not


package Collections;
import java.util.*;
public class HashMapContainsKeyMethod {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        //map string values to int keys
        hashMap.put(10, "Ten");
        hashMap.put(20, "Twenty");
        hashMap.put(30, "Thirty");
        hashMap.put(40, "Forty");
        hashMap.put(50, "Fifty");
        //Display the HashMap
        System.out.println("Initial Mapping is: " + hashMap);
        //check for the key element '20'
        System.out.println("Is the key '20' present? " + hashMap.containsKey(20));
        //check for the key element '5'
        System.out.println("Is the key '5' present? " + hashMap.containsKey(5));

    }
}
