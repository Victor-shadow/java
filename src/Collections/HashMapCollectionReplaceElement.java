package Collections;
import java.util.*;
public class HashMapCollectionReplaceElement {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        System.out.println("Original map: " + hashMap);

        boolean b = hashMap.replace(2, "Two", "Three");
        System.out.println("Was the value replaced? " + b);
        System.out.println("Updated map: " + hashMap);

    }
}
