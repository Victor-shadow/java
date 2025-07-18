package Collections;
import java.util.*;

public class CollectionsNewSetFromMapMethodIllegalArgumentException {
    public static void main(String[]argv) throws Exception{
        try{
            Map<String, Boolean> map = new WeakHashMap<>();
            //Insert values into map
            map.put("1", true);
            //Create Objects of LinkedList
            Set<String> set = Collections.newSetFromMap(map);
            //add values in set
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("D");
            //set and map values
            System.out.println("Map is: " + map);
            System.out.println("Set is: " + set);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
