//The isEmpty() method of Java AbstractCollection is used to check and verify if a Collection is empty or not
//It returns true if the collection is empty else it returns false
//Syntax:
//AbstractCollection.isEmpty()

//Parameters: The method does not take any parameters
//Return Value; The function returns true if the collection is empty else it returns false
package Collections;
import java.util.AbstractCollection;
import java.util.*;
public class AbstractCollectionIsEmpty {
    public static void main(String[]args){
        //Create an Empty Collection
        AbstractCollection<String > abs = new TreeSet<String >();
        //Use add method to add elements to the collection
        abs.add("String");
        abs.add("Integer");
        abs.add("Boolean");
        abs.add("Float");
        abs.add("Double");
        abs.add("Char");
        //Display the Collection
        System.out.println("Collection: " + abs);
        //Check for the empty Collection
        System.out.println("Is the collection empty? " + abs.isEmpty());
        //Clearing the collection
        abs.clear();
        //Again check for the empty collection
        System.out.print("Is the collection empty? " + abs.isEmpty());


    }
}
