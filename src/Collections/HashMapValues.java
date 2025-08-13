/// The java.util.HashMap.values() method of HashMap class in Java is used to create a collection out of the values in the map
/// It basically returns a collection view of the values of the HashMap
/// Syntax: HashMap.values()
/// Parameters: This method does not accept any parameters
/// Return value: This method is used to return a collection view containing all the values of the map
package Collections;
import java.util.*;
public class HashMapValues {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        //map String values to keys
        hashMap.put(10, "Android");
        hashMap.put(20, "Linux");
        hashMap.put(30, "Windows");
        hashMap.put(40, "MAC OS");
        // Display the HashMap
        System.out.println("The initial Hashmap: " + hashMap);
        //using values to get the set view of the values
        System.out.println("The collection is: " + hashMap.values());
    }
}
