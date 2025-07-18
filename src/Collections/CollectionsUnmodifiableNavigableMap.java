//The unmodifiableNavigableMap() in java collections is used to get the unmodifiable view for the given map
//Syntax:
//public static <Key, value> Map<Key, Value> unmodifiableMap(Map<? extends Key, ?  extends Key> map)
//key= key value type
//Value = Is the value type
//map = is the input map
//Return - it will return the unmodifiable view of the given map
//Exception - it will not throw any kind of exception

package Collections;
import java.util.*;
public class CollectionsUnmodifiableNavigableMap {
   public static void main(String[]args){
       //Create HashMap
       HashMap<String, String > data = new HashMap<String, String>();
       //add elements to the created hashMap
       data.put("1", "Java");
       data.put("2", "Kotlin");
       data.put("3", "PHP");
       data.put("4","Python");
       //display data
       System.out.println(data);
       //Create unmodifiable map from the above map
       Map<String, String > finallist = Collections.unmodifiableMap(data);
       //display unmodifiable map
       System.out.println(finallist);
   }
}
