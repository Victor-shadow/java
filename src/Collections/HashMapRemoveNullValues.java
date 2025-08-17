package Collections;

import java.util.HashMap;

public class HashMapRemoveNullValues {
    public static void main(String[]args){
        //Create a Hashmap with Integer Keys and String Values
        HashMap<Integer, String> hashMap = new HashMap<>();
        //add some key-value pairs
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, null);

        //Remove key 2 and print the returned value
        String remove = hashMap.remove(2);
        System.out.println("Removed value for key 2: " + remove);
        //Try to remove non-existent key
        String remove1 = hashMap.remove(4);
        System.out.println("Removed value from non-existent key: " + remove1);
        //remove key 3 (the value was explicitly set to null)
        String nullValue = hashMap.remove(3);
        System.out.println("Removed Value for key 3: " + nullValue);
    }
}
