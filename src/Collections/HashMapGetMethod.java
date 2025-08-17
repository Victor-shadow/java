/// the java.util.HashMap.get() method of HashMap class is used to retrieve and fetch the value mapped by a particular
/// key mentioned in the parameter
/// It returns NULL when the map contains no such mapping for the key
/// Syntax: HashMap.get(Object key_element)
/// Parameter: This method takes parameter key_element  of object type and refers to the key whose associated value is supposed
/// to be fetched
/// Return value; The method returns the value associated with the key_element in the parameter


package Collections;
import java.util.*;
public class HashMapGetMethod {
    public static void main(String[]args){
        //Create an Empty HashMap
        HashMap<Integer, String> hashMap = new HashMap<Integer,String >();
        //map string values to int keys
        hashMap.put(10, "Java");
        hashMap.put(15, "Kotlin");
        hashMap.put(20, "Scala");
        hashMap.put(25, "Rust");
        hashMap.put(30, "Ruby");
        //Display the HashMap
        System.out.println("Initial mappings are: " + hashMap);
        //get the value of 25
        System.out.println("The Value is: " + hashMap.get(25));
        //get the value of 10
        System.out.println("The value is: " + hashMap.get(10));



    }
}
