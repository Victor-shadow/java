///In Java, the containsValue() method of the HashMap Class is used to check whether a particular value is being mapped
/// by a single or more than one key in the HashMap
/// Syntax: public boolean containsValue(Object value)
/// Parameter: The value whose presence is to be checked in the HashMap
/// Return Type: this method returns True if the HashMap contains at least one mapping with the specified value
/// otherwise it returns False


package Collections;
import java.util.*;
public class HashMapContainsValueMethod {
    public static void main(String[]args){
        //Create an empty HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        //map integer values to string keys
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        //Overwrites the value for the key "One":
        hashMap.put("One", 3);
        //display the HashMap
        System.out.println("Initial mapping: " + hashMap);
        //check for value 1
        System.out.println("Is the value '1' present? " + hashMap.containsValue(1));
        System.out.println("Is the value '3' present? " + hashMap.containsValue(3));


    }
}
//In a HashMap, if one adds a duplicate key, the value associated with that key gets updated and the previous value is removed