//Navigable map method is used for convenient navigation methods like: lower key,floor key,ceiling key,higher key along with the popular
//navigation method
//It will take key-value pairs as input

//Syntax:
//NavigableMap<key_datatype,value_datatype> data = new TreeMap<key_datatype,value_datatype>()
//where: //data = input value
//key_datatype = key type element
//value_datatype = value type element

//synchronizedNavigableMap() method will return the synchronized which is a thread safe navigable map backed  by the specified navigable map
//Syntax:
//public static <Key, Value> NavigableMap<K,V> synchronizedNavigableMap(NavigableMap<key,Value>,data)
//where data is the navigable map which will be wrapped in a synchronized navigable map
//Return type: The SynchronizedNavigableMapMethod() returns a synchronized view of the specified NavigableMap
package Collections;
import java.util.*;

public class CollectionsSynchronizedNavigableMap {
    public static void main(String[]args) {
        //Create a Navigable Map
        NavigableMap<String, String> data = new TreeMap<String, String>();
        //Add data values
        data.put("1", "Java");
        data.put("2", "Kotlin");
        data.put("3", "Python");
        data.put("4", "php/laravel");
        //create a synchronized Navigable Map
        Map<String,String> sync = Collections.synchronizedNavigableMap(data);
        System.out.println(sync);
    }
}
