package Collections;
import java.util.*;
public class MapContainsValueMethod {
    public static void main(String[]args){
        //Create an Empty Map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Kotlin", 10);
        map.put("Java", 20);
        map.put("Scala", 30);
        map.put("PHP", 40);
        //Display the map
        System.out.println("Initial map: " + map);
        //Check for the value 10
        System.out.println("Is value 10 present? " + map.containsValue(10));
        //check for the value 20
        System.out.println("Is value 20 present? " + map.containsValue(20));
        //check for the value 100
        System.out.println("Is value 100 present? " + map.containsValue(100));

    }
}
