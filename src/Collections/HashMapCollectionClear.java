package Collections;
import java.util.*;
public class HashMapCollectionClear {
    public static void main(String[]args){
        //Create a HashMap and add key-value pairs
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Kotlin", 10);
        hashMap.put("Java", 15);
        hashMap.put("Scala", 20);
        hashMap.put("Java", 25); //overwrites the previous one
        hashMap.put("Python", 30);
        //print the Initial HashMap
        System.out.println("The Initial HashMap: " + hashMap);
        //clear the HashMap
        hashMap.clear();
        //print the HashMap after clearing
        System.out.println("After clear(): " + hashMap);
    }
}
//The HashMap remains empty after invoking clear() method, but the HashMap Object still exists and can be reused
