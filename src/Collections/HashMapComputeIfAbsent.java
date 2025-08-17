package Collections;
import java.util.*;
public class HashMapComputeIfAbsent {
    public static void main(String[]args){
        HashMap<String, String> hashMap = new HashMap<>();
        //add initial values to the HashMap
        hashMap.put("A", "1");
        hashMap.put("B", "2");

        System.out.println("Initial map: " + hashMap);
        //use computeIfAbsent() method for an Existing key
        String n = hashMap.computeIfAbsent("A", key -> "New Value");
        //use computeIfAbsent() method for non existing key
        String e = hashMap.computeIfAbsent("C", key -> "3");


        System.out.println("Value for existing key 'A': " + n);
        System.out.println("Value for new key 'C': " + e);

        System.out.println("Updated Map: " + hashMap);


    }
}
