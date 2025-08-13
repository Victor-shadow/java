package Collections;
import java.util.*;
public class MapContainsKeyMethod {
    public static void main(String[]args){
        //Create an Empty Map
        Map<String, Integer> map = new HashMap<String , Integer>();
        //Map int values to Strings
        map.put("Monday", 1);
        map.put("Tuesday", 2);
        map.put("Wednesday", 3);
        map.put("Thursday", 4);
        map.put("Friday", 5);
        //display the map
        System.out.println("Initial map: " +map);
        System.out.println("Is the key Sunday present? " + map.containsKey("Sunday"));
        System.out.println("Is the key Monday Present? " + map.containsKey("Monday"));
    }
}
