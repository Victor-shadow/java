/// The keySet() method of java HashMap class is used to return a set containing all keys of a map
/// This set is backed by the HashMap, so if one makes changes to the HashMap it will be reflected in the set
///Syntax: public set<K> keySet()
/// Return type: Returns a set containing all keys in the HashMap
package Collections;
import java.util.*;
public class HashMapKeySet {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        //add key-value pairs
        hashMap.put(1, "String");
        hashMap.put(2, "Boolean");
        hashMap.put(3, "Character");
        hashMap.put(4, "Integer");
        hashMap.put(5, "Float");
        //display the HashMap
        System.out.println("Initial Mapping: " + hashMap);
        //use keySet() to get the set view of keys
        System.out.println("The keys are: " + hashMap.keySet());



    }
}
