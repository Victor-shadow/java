/// The equals() method of Map Interface in Java is used to check if two maps are equal
/// Two maps are considered equal if they meet the following conditions:
/// i)Both maps must have the same size
/// ii)Both maps must contain identical key-value pairs. (It means that every key in one map  must be associated with the same value as in the other map)
/// Syntax of equals Method: public boolean equals(Object o)
/// Parameter: This method takes an object "o" which is compared with equality with the current map
/// Return Type: This method returns "true" if the specified object is equal to the current map otherwise it returns false

package Collections;
import java.util.*;
public class MapEqualsMethod {
    public static void main(String[]args){
        //Create the first HashMap with key value pairs
        Map<Integer, String > map = new HashMap<Integer, String>();
        map.put(1, "January");
        map.put(2, "February");
        map.put(3, "March");
        //Create a second HashMap with key value pairs
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "January");
        map1.put(2, "February");
        map1.put(3, "March");
        //Create a third hash map with Key-value pairs
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "April");
        map2.put(2, "May");
        map2.put(3, "June");

        System.out.println("First HashMap: " + map);
        System.out.println("Second HashMap: " + map1);

        //compare the first and the Second HashMap for equality
        System.out.println("Are the maps equal? " + map.equals(map1));
        System.out.println("First HashMap: " + map);
        System.out.println("Third HashMap: " + map2);

        //Compare the first and third HashMap for equality
        System.out.println("Are the maps equal? " + map.equals(map2));


    }
}
