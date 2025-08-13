package Collections;
import java.util.*;
public class HashGetOrDefaultMethod {
    public static void main(String[]args){
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("Java", null);
        //Key Java exists but its value is null
        //so null is returned
        String string = hashMap.getOrDefault("Java", "Default");
        System.out.println("Value for 'Java' : " + string);
        //key kotlin does not exist so the default value is returned
        String string1 = hashMap.getOrDefault("Kotlin", "Programming language");
        System.out.println("Value for 'Kotlin': " + string1);

    }
}
/// The getOrDefault() method is simple and concise way to handle missing keys in a map
///If the key exists but, it maps to null, we will still get null
///The traditional way to fetch values is :
/// String values;
//// if(map.containsKey(key)){
  ///value = map.get(key);
///} else {
/// value = "default";
///}
/// The same can be done as:
/// String value = map.getOrDefault(key, "default");
