/// The equals() method of java Abstract Map class is used to check for equality between two maps
/// If compares the key-value pair in the current map with the key-value pair of the specified map
/// Syntax:
/// public boolean equals(Object o)
/// Parameter: The object to be compared with the current map
/// Return Type:Returns "true" if the specified object is equal to the current map otherwise it returns false

package Collections;
import java.util.*;
public class AbstractMapEqualsMethod {
    public static void main(String[]args){
         //Create three HashMap Instances
        Map<String,Integer> hash = new HashMap<>();
        hash.put("Android", 1);
        hash.put("Linux", 2);
        hash.put("Windows", 3);

        Map<String,Integer> hash1 = new HashMap<>();
        hash1.put("Windows", 1);
        hash1.put("Linux", 2);
        hash1.put("Android", 3);

        Map<String,Integer> hash2 = new HashMap<>();
        hash2.put("Android", 1);
        hash2.put("Linux", 2);
        hash2.put("Mac", 3);

        System.out.println("First HashMap: " + hash);
        System.out.println("Second HashMap: " + hash1);
        System.out.println("Third HashMap: " + hash2);

        //Check equality between Maps
        System.out.println("Is HashMap equal to HashMap2? " + hash.equals(hash1));
        System.out.println("Is HashMap equals to Hashmap3? " + hash.equals(hash2));


    }
}
