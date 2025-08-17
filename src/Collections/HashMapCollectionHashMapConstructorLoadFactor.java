/// HashMap<K, V> hashMap = new HashMap<K,V>(int initialCapacity, loadFactor(float dataType))
/// It creates a HashMap Instance with a specified initial capacity and a specified load factor


package Collections;
import java.util.*;
class HashMapCollectionHashMapConstructorLoadFactor {
    public static void main(String[]args){
        HashMap<Integer, String> hashMap =new HashMap<>(5, 0.75f);
        //Initialization of a HashMap using Generics
        HashMap<Integer, String> hashMap1 = new HashMap<>(3, 0.5f);
        //add elements using put method
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        hashMap1.put(4, "Four");
        hashMap1.put(5, "Five");
        hashMap1.put(6, "Six");

        //print and display objects of HashMap
        System.out.println("Mappings of HashMap: " +hashMap);
        System.out.println("Mappings of HashMap2: " + hashMap1);


    }
}
