package Collections;
import java.util.HashMap;
import java.util.Map;
public class MapInterfaceHashMap {
    public static void main(String[]args){
        //Create a Map using HashMap
        Map<String, Integer> map = new HashMap<>();
        //add key-value pairs
        map.put("Java", 1);
        map.put("Kotlin", 2);
        map.put("Python", 3);
        System.out.println("Map elements: " + map);
    }
}
