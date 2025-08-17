package Collections;
import java.util.*;
public class HashMapCollectionClone {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        //map string keys to integer values
        hashMap.put("Java", 1);
        hashMap.put("Kotlin", 2);
        hashMap.put("Python", 3);
        //print and display the HashMap
        System.out.println("Original HashMap: " + hashMap);
        //clone the HashMap
        HashMap<String,Integer> hashMap1 = (HashMap<String, Integer>) hashMap.clone();
        System.out.println("Cloned Hashmap: " + hashMap1);

    }
}
//The same operation can be performed with any type of mappings with variations and combinations of different data types
//clone() method does the shallow copy.But here the value in the original and cloned hashmap will not affect
//each other because primitive data types is used