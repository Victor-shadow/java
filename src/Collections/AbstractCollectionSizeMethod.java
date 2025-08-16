//The sizeOf() method of Java Abstraction Collection class is used to get the size of the collection
//or the number of elements present in the collection
//Syntax
//: AbstractCollection.size()

//The method does not take any parameter
//Return value: The method returns the size of the number of elements present in the collection


package Collections;
import java.util.AbstractCollection;
import java.util.*;

public class AbstractCollectionSizeMethod {
    public static void main(String[]args){
        //Create an Empty AbstractCollection
        AbstractCollection<String> abs = new TreeSet<String >();
        //Use add() all method to add all elements in the collection
        abs.add("Apple");
        abs.add("Banana");
        abs.add("Avocado");
        abs.add("Orange");
        abs.add("Grapes");
        abs.add("Peach");
        //Display the collection
        System.out.println("Collection: " + abs);
        //Display the size of the collection
        System.out.println("The size of the collection: " + abs.size());


    }
}
