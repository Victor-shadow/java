package Collections;
import java.util.*;

public class CollectionsUnmodifiableNavigableMapException {
    public static void main(String []args) {
        //Create hash map
        HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
        //add elements to the hash map
        data.put(1, 2);
        data.put(3, 4);
        data.put(5, 6);
     //display data
        System.out.println(data);
        //Create unmodifiable map
        Map<Integer, Integer> finalmap  = Collections.unmodifiableMap(data);
        //put value in final map
        finalmap.put(7, 8);
        //display unmodifiable map
        System.out.println("Unmodifiable map: " + finalmap);
    }
}
