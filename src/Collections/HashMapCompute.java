package Collections;
import java.util.*;
public class HashMapCompute {
    public static void main(String[]args){
        //Create a map and add some values
        Map<String, Integer> map = new HashMap<>();
        map.put("Key1", 10);
        map.put("Key2", 20);
        //print map details
        System.out.println("Map: " + map);
        //The compute() method increments the integer vales in the HashMap
        //remap the values using compute() method
        map.compute("Key1", (key, value) -> (value == null) ? 1: value + 1);

        map.compute("Key2",(key,value) -> (value == null) ? 1: value + 1 );
        System.out.println("New Map: " + map);


    }
}
