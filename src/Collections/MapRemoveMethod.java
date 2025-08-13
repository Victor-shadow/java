package Collections;
import java.util.*;
public class MapRemoveMethod {
    public static void main(String[]args){
        //Initialize a map of type HashMap
        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        map.put("5", "Five");
        System.out.println(map);

        map.remove("2");
        System.out.println(map);

    }

}
//This program demonstrates the use of remove() method in the Map interface using a Hash Map
//It also initializes a HashMap with string keys and values and prints the map and removes the entry with key "2"
//and then prints the map again to show the result of the removal
//The output illustrates how the remove method affects the map by removing the specified key-value pair