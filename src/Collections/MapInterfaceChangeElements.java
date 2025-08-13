package Collections;
import java.util.*;
public class MapInterfaceChangeElements {
    public static void main(String[]args){
        //Initialization of a map using Generics
        Map<Integer, String> hashmap = new HashMap<Integer,String>();
        //Insert the elements
        hashmap.put(1, "Kotlin");
        hashmap.put(2, "Java");
        hashmap.put(3, "Python");

        System.out.println("Initial map: " + hashmap);
        hashmap.put(2, "PHP");
        System.out.println("Updated Map: " + hashmap);
    }
}
