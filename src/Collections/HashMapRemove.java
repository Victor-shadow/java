package Collections;
import java.util.*;
public class HashMapRemove {
    public static void main(String[]args){
        HashMap<Integer,String> hashMap = new HashMap<>();
        //add elements into the HashMap
        hashMap.put(1, "Java");
        hashMap.put(2, "Scala");
        hashMap.put(3, "Python");

        System.out.println("Original Hashmap: " + hashMap);
        //try to remove the key-value pair (2, 'C++')
        boolean remove = hashMap.remove(2, "Scala");
        System.out.println("Was the pair(2, Scala) removed? " + remove);
        System.out.println("HashMap after removal: " + hashMap);
        //try to remove the key-value pair (3, JavaScript)
        boolean remove1 = hashMap.remove(3, "Javascript");
        System.out.println("Was the pair(3, Javascript) removed? " + remove1);
        System.out.println("HashMap after the second attempt: " + hashMap);

    }
}
