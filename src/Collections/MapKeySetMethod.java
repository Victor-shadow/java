package Collections;
import java.util.*;
public class MapKeySetMethod {
    public static void main(String[]args){
        //Initialize a Map of type Hashmap
        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        //add elements of hash map
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");

        System.out.println(map);
        //store keys in sets
        set = map.keySet();
        System.out.println(set);

    }
}
