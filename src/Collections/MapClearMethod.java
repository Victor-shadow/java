package Collections;
import java.util.*;
public class MapClearMethod {
    public static void main(String[]args){
        //Create an empty map
        Map<String, Integer> map = new HashMap<String, Integer>();
        //map int values to string
        map.put("Kotlin", 10);
        map.put("Java", 20);
        map.put("Python", 30);
        map.put("Scala", 40);
        map.put("Javascript", 50);
        //display the map
        System.out.println("Initial mappings are: " + map);
        //clear the map
        map.clear();
        //display the final map
        System.out.println("Final map: " + map);

    }
}
