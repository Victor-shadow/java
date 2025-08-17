package Collections;
import java.util.*;
public class HashMapCollectionReplace {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Kotlin");

        System.out.println("Original map: " + hashMap);

        boolean b= hashMap.replace(2,"Kotlin", "C#");
        System.out.println("Was the value replaced? " + b);
        System.out.println("Updated HashMap " + hashMap);

    }
}
