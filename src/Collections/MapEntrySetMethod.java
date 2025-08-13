package Collections;
import java.util.*;
public class MapEntrySetMethod {
    public static void main(String[]args){
        //Create an Empty Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        //map int values to string
        map.put("Java", 1);
        map.put("Kotlin", 2);
        map.put("Python", 3);
        map.put("Scala", 4);
        map.put("Pandas", 5);
        //display the map
        System.out.println("Initial map: " + map);
        //use entrySet() to get setView
        System.out.println("The set is: " + map.entrySet());


    }
}
