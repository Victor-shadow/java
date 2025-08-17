package Collections;
import java.util.*;
public class HashMapComputeMethodNullPointerException {
    public static void main(String[]args){
        //create a map and add some values
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 10);
        map.put("Key2", 20);
        //print map details
        System.out.println("Map: " + map);
        try {
            //Pass a null key to compute() method
            map.compute(null, (key, value) -> value + 3);
            System.out.println("New Map: " + map);
        }
        catch (NullPointerException e){
            System.out.println("Exception: " + e);
        }

    }
}
