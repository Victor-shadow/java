package Collections;
import java.util.*;
public class MapIsEmptyMethod {
    public static void main(String[]args){
        //Initialize a map of type HashMap
        Map<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");
        System.out.println(map);

        System.out.println(map.isEmpty());

    }
}
