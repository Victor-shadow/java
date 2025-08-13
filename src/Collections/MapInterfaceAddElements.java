package Collections;
import java.util.*;
public class MapInterfaceAddElements {
    public static void main(String[]args){
        //Initialization of a map
        Map<Integer, String> hashmap = new HashMap<>();
        //Initialization of a map using Generics
        Map<Integer, String> hashmap2 = new HashMap<Integer, String>();
        //Insert the elements
        hashmap.put(1, "Monday");
        hashmap.put(2, "Tuesday");
        hashmap.put(3, "Wednesday");

        hashmap2.put(1, "January");
        hashmap2.put(2, "February");
        hashmap2.put(3, "March");

        System.out.println(hashmap);
        System.out.println(hashmap2);
    }
}
