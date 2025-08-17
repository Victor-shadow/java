/// The hashCode() method of the AbstractMap class in Java is used to calculate the hashCode value for a map
/// The hash code is based on the key-value mapping contained in the map
/// It ensures consistency such that two maps with the same entries have the same hash code
/// Syntax: public int hashCode()
/// The method returns an Integer representing the hash code value of the map



package Collections;
import java.util.*;
public class AbstractMapHashCodeMethod {
    public static void main(String[]args){
        //Create a hashMap
        Map<String, Integer> map = new HashMap<>();
        //add key-value pairs
        map.put("Java", 1);
        map.put("Programming", 2);
        map.put("Language", 3);
        //get the hashCode
        System.out.println("Map: " + map);
        System.out.println("HashCode: " + map.hashCode());


    }
}
