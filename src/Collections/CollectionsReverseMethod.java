//The reverse() method of the Collection class is used to reverse the order of elements in a List
//It does not sort the elements, it just reverses their current order
//This class is present in java.util.package
//Syntax:
//import java.util.Collections;
//Collections.reverse(class_obj)

//parameter
//public static void reverse(List myList)
//Exception thrown: It throws UnsupportedOperation Exception if the specified list or its list-iterator does not support the set operation


package Collections;
import java.util.*;

public class CollectionsReverseMethod {
    public static void main(String[] args){
        //list of strings
        List<String > mylist = new ArrayList<>();
        //Adding elements to the list
        mylist.add("Php");
        mylist.add("Java");
        mylist.add("Lynx");
        //print all elements originally
        System.out.println("Original list: " + mylist);
        //use reverse() method to reverse the elements
        Collections.reverse(mylist);
        //print all the elements in the list in reverse order
        System.out.println("Modified list: " + mylist);
    }
}
