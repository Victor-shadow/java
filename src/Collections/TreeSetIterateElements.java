/// There are various ways to iterate through the TreeSet
/// The most common method to use is the for each loop


package Collections;
import java.util.*;
public class TreeSetIterateElements {
    public static void main(String[]args){
        //Create an Object of Set with Reference to TreeSet
        Set<String> set = new TreeSet<>();
        //add elements to the set()
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        //for each loop to iterate over the TreeSet
        for (String value: set){
            //print the values inside the object
            System.out.println(value + " ,");

            System.out.println();
        }

    }
}
