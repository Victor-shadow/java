/// The putAll() method of java HashMap class is used to copy all key-value mappings from another map
/// to the existing map
/// If a key exists in both maps, its value is updated with a value from the source map. Otherwise, new key-value pairs are
/// added
///Syntax: public void putAll(Map map)
/// Parameters: The map whose mapping are copied into the HashMap


package Collections;
import java.util.*;
public class HashMapPutAllMethod {
    public static void main(String[]args){
        //Create First HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Kotlin");

        System.out.println("HashMap: " + hashMap);
        //Create Second HashMap
        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(3, "Rust");
        hashMap1.put(4, "Ruby");

        //copy all mappings from hashMap1 to hashMap
        hashMap.putAll(hashMap1);
        System.out.println("Updated HashMap: " + hashMap);



    }
}
