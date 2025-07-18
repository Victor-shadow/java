package Collections;
//The checkedNavigableMap method of java collections is a method that returns a dynamically and typesafe
//view of the given map
//Any Attempt to insert an element of the wrong type will result in an immediate ClassCastException

//Syntax:
//public static <Key, Value> NavigableMap<Key,Value> checkedNavigationMap(NavigableMap<Key, Value> Map, Class<Key>
//keyType, Class<V> valueType)

//Parameters
//Key is the key
//Value is the value
//Map is the input map
//Key Type is the data type of the key
//Value Type is the data type of the value

//Return:This method returns a dynamically and typesafe view of the given Map
//Exceptions:
//ClassCastExceptions: ClassCastException is a Runtime exception raised in Java when we improperly cast a class
//another


import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CollectionsCheckedNavigableApp {
    public static void main(String[]args){
        //Create a tree map
        NavigableMap<String, Integer> data = new TreeMap<>();
        //Insert Values into the given map
        data.put("id1",10);
        data.put("id2",20);
        data.put("id3",30);
        data.put("id4",40);

        //Create type safe view  of the given Map
        System.out.println(Collections.checkedNavigableMap(data, String.class, Integer.class));
    }

}
