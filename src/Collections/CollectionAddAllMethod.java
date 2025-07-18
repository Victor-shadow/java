//the addAll(Collection collection) method of java.util.Collection interface is used to add the Collection "collection" to this existing collection
//This method returns a boolean value depicting the successfulness of the operation
//If the collection was added it returns true otherwise it will return false
//Syntax:
//Collection.addAll(Collection<E> collection)
//The method accepts a mandatory parameter collection of type Collection which is to be added to the collection
//Return value: This method returns a boolean value depicting the successfulness of the operation. If the collection was added it returns true otherwise false

//Exception:
//UnsupportedOperationException = If the add operation is not supported by this collection
//ClassCastException = If the class of the specified element prevents it from being added to this collection
//NullPointerException = If the specified element is null or the specified collection does not permit null elements
//IllegalArgumentException =  = if some property of the element prevents it from being added to the collection
//IllegalStateException =  If the element cannot be added at this time due to insertion restrictions


package Collections;
import java.util.*;
public class CollectionAddAllMethod {
    public static void main(String[]args){
        //Create an Empty LinkedList
        Collection<String> linkedlist = new LinkedList<String>();

        linkedlist.add("Java");
        linkedlist.add("Kotlin");
        linkedlist.add("Python");
        linkedlist.add("Scala");

        //Create a Collection
        Collection<String> list = new LinkedList<String>();
        //Display the List
        System.out.println("The linked list is: " + list);
        //Append the collection to the list
        list.addAll(linkedlist);
        //Display the modified linked list
        System.out.println("The new linked list is: " + list);


    }
}
