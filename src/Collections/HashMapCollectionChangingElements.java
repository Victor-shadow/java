package Collections;
import java.util.*;
class HashMapCollectionChangingElements {
    public static void main(String[]args){
        //Initialize a HashMap
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
        //change values using put() method
        hashMap.put(1, "Java");
        hashMap.put(2, "Kotlin");
        hashMap.put(3, "Scala");

        System.out.println("Initial map: " + hashMap);
        hashMap.put(2, "Rust");
        System.out.println("Updated Map: " + hashMap);

    }
}
