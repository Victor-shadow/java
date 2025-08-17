package Collections;
import java.util.*;
public class HashMapReplaceElement {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");

        System.out.println("Initial hashMap: " + hashMap);
        //replace value for key 2 if old value matches
        boolean b = hashMap.replace(3, "Javascript", "C#");
        System.out.println("Was replacement successful? " + b);
        System.out.println("Final HashMap: " + hashMap);


    }
}
