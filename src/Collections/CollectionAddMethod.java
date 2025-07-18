//The add(E element) of java.util.Collection interface  is used to add the element 'element' to the collection
//This method returns a boolean value depicting the successfulness of the operation
//If the element was added it returns true otherwise false

//Syntax:
//Collection.add(E element)
//The method accepts a mandatory parameter element of type E which is to be added to the collection
//Return Value: A Boolean value depicting the successfulness of the operation. If the element was added it returns true otherwise false
//Exceptions:
//UnsupportedOperationException = If the add operation is not supported by the collection
//ClassCastException = If the class of the specified element prevents it from being added to the collection
//NullPointerException = If the specified element is null and this collection does not permit null elements
//IllegalArgumentException = If some property of an element prevents it from being added to the collection
//IllegalStateException = If the element cannot be added at this time due to insertion restrictions
package Collections;
import java.io.*;
import java.util.*;
public class CollectionAddMethod {
    public static void main(String[]args){
        //Create an empty linked list
        Collection<String> linkedlist = new LinkedList<String>();
        //Use add() method to add elements to the list
        linkedlist.add("Java");
        linkedlist.add("Kotlin");
        linkedlist.add("PHP");
        //Output the present list
        System.out.println("The list is: " + linkedlist);
        //Add new elements at the end
        linkedlist.add("Python");
        linkedlist.add("Scala");
        //print the new list
        System.out.println("The new list is: " + linkedlist);
    }
}
