package Collections;
import java.util.*;
public class MapInterfaceRemoveElements {
    public static void main(String[]args){
        //Initialization of a map using Generics
        Map<Integer, String> hashmap =new HashMap<Integer, String>();
        //Insert the elements
        hashmap.put(1, "French");
        hashmap.put(2, "Spanish");
        hashmap.put(3, "Greek");
        hashmap.put(4, "Serbian");
        System.out.println(hashmap);

        hashmap.remove(1);
        System.out.println(hashmap);
    }
}
