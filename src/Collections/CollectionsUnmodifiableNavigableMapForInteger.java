package Collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsUnmodifiableNavigableMapForInteger {
    public static void main(String[]args){
        HashMap<Integer, Integer>  data = new HashMap<Integer, Integer>();
        //Add elements to the created HashMap
        data.put(100, 150);
        data.put(200, 250);
        data.put(300, 350);
        data.put(400, 450);
        //display data
        System.out.println(data);
        //Create unmodifiable map
        Map<Integer, Integer> finalList = Collections.unmodifiableMap(data);
       //display unmodifiable map
        System.out.println(finalList);
    }
}
