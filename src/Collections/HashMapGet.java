package Collections;

import java.util.HashMap;

public class HashMapGet {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Java", 1);
        hashMap.put("Kotlin", 2);
        hashMap.put("Scala", 3);
        hashMap.put("Python", 4);
        hashMap.put("Rust", 5);
        //display the HashMap
        System.out.println("Initial mappings are: " + hashMap);
        System.out.println("The value is: "+ hashMap.get("Java"));
        System.out.println("The value is: " + hashMap.get("Rust"));
    }
}
//The same operation can be performed on any type of mappings with variation and combination of different data types