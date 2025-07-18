//The AbstractCollection class in java is part of the java collection framework and implements the Collection Interface
//It is used to implement an unmodifiable collection for which one only needs to extend this AbstractCollection Class and implement only the iterator and the size methods

//Syntax
//public abstract class AbstractCollection<E> extends Object implements Collection<E>
//where e is the type of element to be maintained by this collection

//Constructors in java AbstractCollection
//protected AbstractCollection() = The default constructor, but being protected does not allow the creation of an AbstractCollection Object


package Collections;
import java.util.*;
import java.util.AbstractCollection;

public class AbstractClassCollection {
    public static void main(String[]args){
        //Create an Empty Collection
        AbstractCollection<Object> abs = new ArrayList<Object>();
        //Use add() method to add elements in the collection
        abs.add("Java");
        abs.add("Kotlin");
        abs.add("Python");
        abs.add("C++");
        abs.add("Laravel");

        //Display the Collection
        System.out.println("AbstractCollection: " + abs);

    }
}
