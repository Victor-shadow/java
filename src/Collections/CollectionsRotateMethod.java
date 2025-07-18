package Collections;
import java.util.*;

//java.util.Collections.rotate() method is present in java.util.Collections() class
//it is used to rotate the elements present in the specified list of Collection by a given distance
//syntax:
//public static void rotate(List <type> list, int distance)
//parameters:
//list - the list to be rotated
//distance - the distance to rotate the list
//type - the type of list to be rotated: Integer, String
//Returns: NA
//Throws UnsupportedOperationException - if the specified list or its list-iterator does not support the set operation
//There are no constraints on distance value
//It may be zero, negative,or greater than list.size()
//After calling this method, the element at index i will be the element previously at index(i-distance) mod list.size() for all values of i between
//0 and list.size() -1 inclusive
public class CollectionsRotateMethod {
    public static void main(String[]args){
        //List of Strings
        List<String> list = new ArrayList<String>();
        list.add("Python");
        list.add("Java");
        list.add("PHP/Laravel");
        list.add("Kotlin");

        System.out.println("Original List: " + list);

        //Use of rotate method() to rotate the element by 2 distances
        Collections.rotate(list, 2);
        System.out.println("Rotated list: " + list);
    }
}
