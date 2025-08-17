package Collections;
import java.util.*;
public class HashMapPutAllNullPointerException {
    public static void main(String[]args){
        //Create a HashMap
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        //pass null to pullAll()
        HashMap<Integer,String> hashMap1 = null;

        hashMap.putAll(hashMap1);

    }
}
