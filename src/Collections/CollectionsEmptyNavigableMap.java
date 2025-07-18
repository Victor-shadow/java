package Collections;
import java.util.*;

//The Java Collections emptyNavigableMap() method is used to get a map with no elements
//A Navigable map is a data structure that can hold element with key-value pairs
//Syntax:
//public static final <Key,Value> SortedMap<Key, Value> emptyNavigableMap()
//where:
//key =  is the key element
//value = is the value element
//the method will take no parameters
//It returns an empty navigable map that is immutable

public class CollectionsEmptyNavigableMap {
    public static void main(String[]args){
        //Create an empty navigable map
        SortedMap<String, String> data  = Collections.emptyNavigableMap();
        System.out.println(data);
    }

}
