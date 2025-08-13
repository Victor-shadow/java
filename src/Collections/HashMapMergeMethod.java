package Collections;
import java.util.*;
public class HashMapMergeMethod {
    public static void main(String[]args){
        //Create a hashMap to store key-value pairs
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 100);
        hashMap.put("B", 200);
        //use merge for a key that is not present in the map
        hashMap.merge("C", 30, (
                oldValue, newValue
                ) -> oldValue + newValue);
        //use merge for a key that is already present in the map
        hashMap.merge("A", 20, (oldValue,newValue) -> oldValue + newValue);
        System.out.println(hashMap);

    }
}
