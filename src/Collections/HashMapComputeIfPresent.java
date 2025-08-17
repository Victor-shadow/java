package Collections;
import java.util.*;
public class HashMapComputeIfPresent {
    public static void main(String[]args){
        //Create a HashMap and add some values
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two",2);
        hashMap.put("Three", 3);
        //print hash map details
        System.out.println("HashMap before operation :\n" + hashMap);
        //key "Java" is not present in the map, so no change
        hashMap.computeIfPresent("Java", (key, value) -> value + 100);
        //print after mapping
        System.out.println("Hashmap after operation: \n" + hashMap);

    }
}
