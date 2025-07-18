//The containsALL() method in Java Abstract Collection  is used to check whether a collection contains all elements of another collection

//Syntax of AbstractCollection.containsAll()
//boolean.containsAll(Collection c);

//Parameters;The Parameter C is a Collection refers  to the collection whose elements occurrence needs to be checked in this collection
//Return value: The method returns true if the collection contains all the elements of the other collection otherwise it returns false


package Collections;
import java.util.*;

class AbstractCollectionContainsAllMethod {
    public static void main(String[]args){
        //Create an Empty Collection
        AbstractCollection<String> abs = new LinkedList<String>();
        //Use add() method to add elements in the collection
        abs.add("Java");
        abs.add("Kotlin");
        abs.add("Scala");
        abs.add("Python");
        abs.add("C++");

        //Create another empty collection
        AbstractCollection<String> abs2 = new LinkedList<String>();
        abs2.add("Java");
        abs.add("Kotlin");
        abs2.add("Scala");
        abs2.add("Python");
        abs2.add("C++");

        //Check if the collection contains same elements
        System.out.println("Both the collections same: " + abs.containsAll(abs2));

    }
}
