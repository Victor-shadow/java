package Collections;
import java.util.*;

//The emptySortedMap() method of Java Collections is used to get a map that has no elements
//Sorted map is a data structure that can hold elements with Key-Value pairs in sorted order

//Syntax:
//public static final <key, Value> sortedMap<key, value> emptySortedMap() where:
//key=is the key element
//value= is the value element

//The method does not take any parameters
//It will return an empty sorted map that is immutable


public class CollectionsEmptySortedMap {
    public static void main(String[]args){
        SortedMap<String , String > data = Collections.emptySortedMap();
        //print
        System.out.println(data);
    }

}
