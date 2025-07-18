//The newSetFromMap() method in java.util.Collections class is used to return a set backed by the specified map
//The resulting set displays the same ordering, concurrency, and performance characteristics as the backing map
//In essence, this factory method provides a Set Implementation corresponding to any Map Implementation. There is no need to use this method on a Map Implementation
//that has a corresponding Set Implementation(HashMap,TreeMap)
//Syntax: public static Set newSetFromMap(Map map)
//Parameters: this method takes the backing map as the parameter
//Return Value: This method returns the set backed by the map
//Exception: This method throws IllegalArgumentException if map is not empty
package Collections;
import java.util.*;

public class CollectionsNewSetFromMap {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of Map
            Map<String, Boolean> map = new WeakHashMap<>();
            //Create LinkedList Object
            Set<String> set = Collections.newSetFromMap(map);
            //Add values in the set
            set.add("A");
            set.add("B");
            set.add("C");
            set.add("D");
            set.add("E");
            //set and map values
            System.out.println("Map is: " + map);
            System.out.println("Set from map is: " + set);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
