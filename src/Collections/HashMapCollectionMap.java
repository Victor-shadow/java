/// HashMap(Map map) method creates an Instance of HashMap with the same mappings as the specified map
/// Syntax: HashMap<K, V> hashMap = new HashMap<K,V>(Map map)

package Collections;
import java.util.*;
public class HashMapCollectionMap {
    public static void main(String[]args){
        Map<Integer, String> map = new HashMap<>();
        //add elements using put method
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        //Initialize HashMap using Generics
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>(map);
        System.out.println("Mappings of HashMap map are: " + map);
        System.out.println("Mappings of HashMap are: " + hashMap);

    }
}
