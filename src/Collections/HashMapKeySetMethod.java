package Collections;

import java.util.HashMap;

public class HashMapKeySetMethod {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        //add key-value pairs
        hashMap.put("One", 10);
        hashMap.put("Two", 20);
        hashMap.put("Three", 30);
        hashMap.put("Four", 40);
        hashMap.put("Five", 50);
        //display the HashMap
        System.out.println("Initial Mappings: " + hashMap);
        //use keySet() to get set view of the keys
        System.out.println("The keys are: " + hashMap.keySet());
    }
}
