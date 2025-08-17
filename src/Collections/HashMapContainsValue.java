package Collections;
import java.util.*;
public class HashMapContainsValue {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        //map string values to integer keys
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        //display the HashMap
        System.out.println("Initial Mappings: " + hashMap);
        //check for the value "One"
        System.out.println("Is the value 'One' present? " + hashMap.containsValue("One"));
        System.out.println("Is the value 'Five' present? " + hashMap.containsValue("Five"));
    }
}
