package Collections;
import java.util.*;
public class HashMapIsEmpty {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        //display the HashMap
        System.out.println("HashMap: " + hashMap);
        //check if the map is empty
        System.out.println("Is the map empty? " + hashMap.isEmpty());
        //add key value pairs
        hashMap.put(1, "Java");
        hashMap.put(2, "Programming");
        hashMap.put(3, "Language");
        //display updated Map
        System.out.println("Updated HashMap contents: " + hashMap);
        //check if the map is empty
        System.out.println("Is the map empty? " + hashMap.isEmpty());


    }
}
