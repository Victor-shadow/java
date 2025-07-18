//The remove(Object O) method of Java AbstractCollection Class is used to remove a particular element from a collection
//Syntax:
//AbstractCollection.remove(Object O)

//Parameter; The Parameter O is of the type Collection  and specifies the element to be removed from the collection
//Return Value; This method returns True if the element specified in the parameter is initially present in the collection and is successfully removed
//otherwise it returns false


package Collections;
import java.util.*;
import java.util.AbstractCollection;

public class AbstractCollectionRemoveMethod {
    public static void main(String[]args){
        //Create an Empty AbstractCollection
        AbstractCollection<String > abs = new TreeSet<String >();
        //add elements in the collection
        abs.add("February");
        abs.add("March");
        abs.add("April");
        abs.add("May");
        abs.add("June");
        abs.add("July");

        //Display the Collection
        System.out.println("Collection: " + abs);
        //Remove elements use remove() method
        abs.remove("July");
        abs.remove("June");
        //Display collection after removal
        System.out.println("New collection: " + abs);
    }

}
