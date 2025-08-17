/// HashMap(int initialCapacity) method creates an instance of HashMap with a specific initial capacity and load factor
/// of 0.75
/// Syntax: HashMap<K,V> hashMap = new HashMap<K, V>(int initialCapacity)

package Collections;
import java.util.*;
class HashMapCollectionHashMapConstructorInitialCapacity {
    public static void main(String[]args){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>(10);
        //Initialize a HashMap using Generics
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>(2);
       //Add elements to the HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        hashMap1.put(4, "Four");
        hashMap1.put(5, "Five");
        hashMap1.put(6, "Six");

        //print elements of HashMap
        System.out.println("Mappings of HashMap are: " + hashMap);
        System.out.println("Mappings of HashMap2 are: " + hashMap1);


    }
}
