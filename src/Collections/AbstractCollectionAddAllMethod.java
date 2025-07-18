//the addAll() method in Java Abstract Collection is used to append all given elements  from a given collection to the current collection
//If The collection being appended to is  the TreeSet, the elements are stored in a sorted order
//as Tree Set maintains a natural ordering of elements
//The AbstractCollection cannot be instantiated directly, so we use Collection as the type instead

//Syntax of AbstractCollection addAll()
//boolean addAll(Collection c)

//parameter: the parameter "c" is a collection of any type that is to be added to the collection
//Return value: The method returns "true" if it successfully appends the elements of the collection c to the existing collection else false

//Exception: It throws a NullPointerException if the specified collection is null
//Unsupported OperationException: If the collection does not support add() operation

package Collections;
import java.util.*;
import java.util.AbstractCollection;


public class AbstractCollectionAddAllMethod {
    public static void main(String[]args){
        //Create an empty collection
        Collection<String> collection = new TreeSet<>();

        //Add Elements to the collection
        collection.add("Java");
        collection.add("Kotlin");
        collection.add("Python");
        collection.add("Java"); //duplicate will be removed
        collection.add("Html");
        collection.add("Scala");

        System.out.println("Collection: " + collection);

        //Create another empty collection
        Collection<String> collection2 = new TreeSet<>();

        //Display the empty collection
        System.out.println("Collection 2 (before AddAll): " + collection2);
        //use addAll to append all elements
        collection2.addAll(collection);
        //Display the collection after adding all elements
        System.out.println("Collection 2 (after AddAll) " + collection2);



    }
}
