/// HashMap(): It is the default constructor that creates an Instance of the HashMap with an initial capacity of 16
/// and a load factor of 0.75
///
/// /// Syntax: HashMap<K, V> hashMap = new HashMap<K,V>

package Collections;
import java.util.*;
public class HashMapCollectionHashMapConstructor {
    public static void main(String[]args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        //Initialize a HashMap using generics
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        //add elements using put() method
        hashMap.put( 1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        hashMap1.put(4, "Four");
        hashMap1.put(5, "Five");
        hashMap1.put(6, "Six");

        //print and display mappings of HashMap
        System.out.println("Mappings of HashMap are: " + hashMap);
        System.out.println("Mappings of HashMap2 are: " + hashMap1);

    }
}
