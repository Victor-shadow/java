package Collections;
import java.util.*;
public class HashMapPutIfAbsentMethod {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        //Insert some values
        hashMap.put(1, "C++");
        hashMap.put(2, "Java");

        //Use putIfAbsent
        System.out.println("Before putIfAbsent(): " + hashMap);
        //key does not exist so the value is inserted
        hashMap.putIfAbsent(3, "Python");
        //Key exists so value is not inserted
        hashMap.putIfAbsent(2, "Kotlin");

        System.out.println("After putIfAbsent(): " + hashMap);

    }
}
