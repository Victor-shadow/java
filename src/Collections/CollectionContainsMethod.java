//The contains(Object element) of java.util.Collection interface is used to check whether the element 'elements' exist in the collection
//This method returns a boolean value depicting the presence of the element
//If the element is present it returns true otherwise false
//Syntax
//Collection.contains(Object Element)
//Parameters: This method accepts a mandatory parameter element of type Object which is to be checked in the collection
//Return value: This method returns a boolean value depicting the presence of the element
//if the element is added it returns true or else false

//Exceptions
//ClassCastException: if the class of the specified element prevents it from being added to the collection
//NullPointerException: If the specified element is null and this collection does not permit null elements
package Collections;
import java.util.*;

public class CollectionContainsMethod {
    public static void main(String[]args){
        //Create an Empty LinkedList
        Collection<String> collection = new LinkedList<String >();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        //Output the present list
        System.out.println("The list is: " + collection);
        //Check the presence of "1" using contains method
        boolean result = collection.contains("1");
        //print the result
        System.out.println("Is 1 present in the list: " + result);
    }

}
