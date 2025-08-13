package Collections;
import java.util.*;
public class HashMapSizeMethod {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        //add elements to the HashMap
        hashMap.put("Java", 10);
        hashMap.put("Kotlin", 20);
        hashMap.put("Scala", 30);
        hashMap.put("Python", 40);
        hashMap.put("Javascript", 50);

        System.out.println("Size of the hashMap: " + hashMap.size());
        //Remove an element
        hashMap.remove("Javascript");
        //Display the size of the HashMap after remove
        System.out.println("Size of the new HashMap: " + hashMap.size());


    }
}
