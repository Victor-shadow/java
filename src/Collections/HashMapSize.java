/// The size() method of the Java HashMap class is used to retrieve the number of key-value pairs
/// currently stored in the HashMap
/// Syntax: public int size()
/// Return type: It returns an int value representing the number of key-value mappings in the HashMap
package Collections;
import java.util.*;
public class HashMapSize {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        //add elements to the HashMap
        hashMap.put("Java", 10);
        hashMap.put("C++", 20);
        hashMap.put("Ruby", 30);

        System.out.println("Size of the hash Map: " + hashMap.size());



    }
}
