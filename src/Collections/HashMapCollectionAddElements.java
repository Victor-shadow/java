package Collections;
import java.util.*;
class HashMapCollectionAddElements {
    public static void main(String[]args){
        HashMap<Integer, String> hashMap = new HashMap<>();
        //Initialize a HashMap using Generics
        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        //add elements using put() method
        hashMap.put(1, "Java");
        hashMap.put(2, "Kotlin");
        hashMap.put(3, "Rust");

        hashMap1.put(4, "C#");
        hashMap1.put(5, "C++");
        hashMap1.put(6, "Python");

        System.out.println("Mappings of HashMap are: " + hashMap);
        System.out.println("Mappings of HashMap1 are: " + hashMap1);

    }
}
