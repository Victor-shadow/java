package Collections;
import java.util.*;
public class HashMapReplaceMethod {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, "Python");

        System.out.println("Initial HashMap: " + hashMap);
        //replace value for key 2
        //if old value matches
        boolean b =hashMap.replace(2, "JavaScript", "C#");
        System.out.println("Was replacement successful? " + b);
        System.out.println("Updated HashMap: " + hashMap);

    }
}
