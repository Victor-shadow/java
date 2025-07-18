package Collections;
import java.util.*;

public class CollectionsSynchronizedNavigableMapMethod {
    public static void main(String[]args){
        //Create a Navigable Map
        NavigableMap<Integer,Integer> data = new TreeMap<Integer, Integer>();
        //Add data Values
        data.put(1, 100);
        data.put(2, 200);
        data.put(3, 300);
        data.put(4, 400);
        data.put(5, 500);
        data.put(6, 600);
        //Create a Synchronized Navigable Map
        Map<Integer,Integer> sync = Collections.synchronizedNavigableMap(data);
        System.out.println(data);
    }
}
