package Collections;
import java.util.*;
public class HashMapCollectionTraverseElements {
    public static void main(String[]args){
        //Initialize a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        //add elements using put() method
        map.put("Java", 10);
        map.put("Kotlin", 20);
        map.put("Scala", 30);
        //Iterate over the map using for each map
        for (Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }

    }
}
