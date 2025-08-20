package Collections;
import java.util.*;
public class HashMapClass {
    //Main method
    public static void main(String[]args){
        //Create a HashMap and add elements
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Kotlin");
        hashMap.put(3, "Scala");

        //find the value for a key
        System.out.println("Value for 1 is: " + hashMap.get(1));
        //Traverse through the HashMap
        for (Map.Entry<Integer,String> e: hashMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
