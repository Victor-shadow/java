/// The isEmpty() method in Java HashMap class is used to check whether the map contains key-value mappings
/// Syntax: public boolean isEmpty()
/// Return type
/// It returns true if the map contains no key-value mapping
/// It returns false if the map has one or more key-value mapping

package Collections;
import java.util.*;
public class HashMapIsEmptyMethod {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
        //map integer values to string keys
        hashMap.put("Java", 1);
        hashMap.put("Programming", 2);
        hashMap.put("Language", 3);
        //Display the HashMap
        System.out.println("The mappings are: " + hashMap);
        //check if the map is empty
        System.out.println("Is the map empty? " + hashMap.isEmpty());



    }
}
