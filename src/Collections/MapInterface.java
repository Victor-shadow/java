package Collections;
import java.util.*;
class MapInterface {
    public static void main(String[] args) {
        //Create an Empty HashMap
        Map<String, Integer> hashmap = new HashMap<String, Integer>();
        //insert pairs in the above map using put() method
        hashmap.put("a", 100);
        hashmap.put("b", 200);
        hashmap.put("c", 300);
        hashmap.put("d", 400);
        //traverse the map using for-each loop
        for (Map.Entry<String, Integer> mp:hashmap.entrySet()){
            System.out.print(mp.getKey() + ":");
            System.out.println(mp.getValue());
        }

    }
}
