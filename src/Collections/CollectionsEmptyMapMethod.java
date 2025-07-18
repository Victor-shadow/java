package Collections;
//The emptyMap() method of Java Collections is a method that is used to return an empty map such that we cannot change the
//data in the map(It Is immutable)

//Syntax:
//public static final <Key,Value> Map<Key, Value> emptyMap()
//where:
//key: is the key element
//value: is the value element

//The method does not accept any parameters
//The method returns an empty immutable map
//Exception: It does not arise any exception

import java.util.Collections;
import java.util.Map;

public class CollectionsEmptyMapMethod {
    public static void main(String[]args){
        //create an empty map
        Map<String, String> data = Collections.emptyMap();
        System.out.println(data);
    }

}
