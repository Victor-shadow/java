package Collections;
import java.util.*;
public class MapInterfaceIterate {
    public static void main(String[]args){
        //Initialize a map using generics
        Map<Integer, String> hashmap = new HashMap<Integer, String>();
        //Insert the elements
        hashmap.put(1, "January");
        hashmap.put(2, "February");
        hashmap.put(3, "March");

        for (Map.Entry mapElement : hashmap.entrySet()){
            int key = (int)mapElement.getKey();
            //Find the value
            String value = (String) mapElement.getValue();
            System.out.println(key + ":" + value);
        }

    }
}
