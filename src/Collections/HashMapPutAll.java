package Collections;
import java.util.*;
public class HashMapPutAll {
    public static void main(String[]args){
        //Create the First Hashmap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Kotlin");

        System.out.println("HashMap: " + hashMap);

        //Create Second HashMap
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        //this key already exists in HashMap
        hashMap1.put(2, "Java");
        hashMap1.put(4, "Rust");
        //copy all hashMap1 into HashMap
        hashMap.putAll(hashMap1);
        System.out.println("Updated HashMap: " + hashMap);

    }
}
