package Collections;
import java.util.*;
public class HashMapCollection {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<String, Integer> hash = new HashMap<>();
        //add elements to the HashMap
        hash.put("Java", 1);
        hash.put("Kotlin", 2);
        hash.put("Rust", 3);
        hash.put("Python", 4);
        hash.put("Scala", 5);
        hash.put("Ruby", 6);
        //access elements in the HashMap
        System.out.println(hash.get("Java"));
        //remove an element from the HashMap
        hash.remove("Kotlin");
        //check if an element is present in the HashMap
        System.out.println(hash.containsKey("Rust"));
        //output: false
        //get the size of the HashMap
        System.out.println(hash.size());

    }
}
