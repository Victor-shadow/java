/// The add(int index, E element) method of List Interface in Java is used to insert the specified element at the given
/// index in the current list
/// Syntax of Method: public add(int index, E element)
/// Parameters: This method accepts two parameters:
/// index: The parameter specifies the index at which the given element is to be inserted
/// element: The parameter specifies the element to insert in the list

/// Return value: Boolean and it returns true if the object is added successfully
/// Exceptions:
/// UnsupportedOperationException: It throws this exception if the class of the specified element prevents it from being added to the list
/// ClassCastException: It throws this exception if the class of the specified element prevents it from being added to the list
/// NullPointerException: It throws this exception if the specified element  is null and the list does not permit null elements
/// IllegalArgumentException: It throws the exception if some property of this element prevents it from being added to the list

package Collections;
import java.util.*;
public class ListInterfaceAddMethodArrayList {
    public static void main(String[]args){
        //Create the list
        List<String> list = new ArrayList<String>(5);
        //add elements to the list
        list.add("Java");
        list.add("Kotlin");
        list.add("Python");
        //use add method to initially add elements to the list
        list.add(0, "C#");
        //print elements
        for (String string: list){
            System.out.println(string + " ");
        }
    }
}
