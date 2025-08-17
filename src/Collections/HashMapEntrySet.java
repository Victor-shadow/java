package Collections;
import java.util.*;
public class HashMapEntrySet {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        //map integer values to String keys
        hashMap.put("Ten",10);
        hashMap.put("Twenty",20);
        hashMap.put("thirty",30);
        hashMap.put("Forty",40);
        hashMap.put("Fifty",50);
        hashMap.put("thirty", 60);
        //display the HashMap
        System.out.println("Initial mappings: " + hashMap);
        //use entrySet to get the set view
        System.out.println("The set is: " + hashMap.entrySet());



    }
}
