package Collections;
import java.util.*;
public class HashMapCollectionReplaceElements {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer, String> hashMap =new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(3, "Three");

        System.out.println("Original map: " + hashMap);
        //check if key exists
        if (hashMap.containsKey(3)){
            String oldValue = hashMap.replace(3, "Two");
            System.out.println("Replaced value: " + oldValue);
        } else {
            System.out.println("Key 3 does not exist");
        }
        System.out.println("Updated map: " + hashMap);


    }
}
