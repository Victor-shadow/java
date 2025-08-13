package Collections;
import java.util.*;
public class MapGetMethod {
    public static void main(String[]args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        //map string values to int keys
        map.put(10, "Java");
        map.put(20, "Kotlin");
        map.put(30, "Scala");
        map.put(40, "Python");
        map.put(50, "PHP");
        //Display the map
        System.out.println("Initial map: " + map);
        //Get the value of 40
        System.out.println("The value of 40 is: " + map.get(40));
        //Get the value of 10
        System.out.println("The value of 10 is: " + map.get(10));

    }
}
