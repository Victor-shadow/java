package Collections;
import java.util.*;
import java.util.function.BiConsumer;

public class HashMapForEachBiConsumer {
    //main method
    public static void main(String[]args){
        //Create a HashMap and add some values
        Map<String,Integer> map = new HashMap<>();

        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);

        //Create an Action
        BiConsumer<String,Integer> action = new MyBiConsumerInterface();
        //call for each method
        map.forEach(action);
    }
}

//Define Action in MyBiConsumer class
class MyBiConsumerInterface implements BiConsumer<String,Integer>{
    public void accept(String k, Integer v){
        System.out.println("Key: " + k + "\tValue: " + v);
        if ("for".equals(k)){
            System.out.println("Its the " + "highest value\n");
        }
    }

}
