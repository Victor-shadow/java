package Collections;
import java.util.*;
class HashMapCollectionRemoveElements {
    public static void main(String[]args){
        //Initialize a HashMap
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        //add elements using put() method
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        //Initial HashMap
        System.out.println("Mappings of HashMap are: " + hashMap);
        //remove() method to remove an element key
        hashMap.remove(4);
        //final hash map
        System.out.println("Mapping after removal: " + hashMap);


    }
}
