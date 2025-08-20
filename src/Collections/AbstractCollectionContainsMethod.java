//The contains() method in Java Abstract Collection  is used to check whether an element is present in a Collection or not
//It takes the element as a parameter and returns True if the element is present in a Collection or not
//Syntax:
//AbstractCollection.contains(Object element)

//Parameters:
//The parameter element is of type Collection. This parameter refers to the element whose occurrence is needed to be checked in the collection
//Return Value: The method returns true if the element is present  in the collection otherwise it returns false
package Collections;
import java.util.AbstractCollection;
import java.util.LinkedList;

public class AbstractCollectionContainsMethod {
    public static void main(String[]args){
        AbstractCollection<String> abs = new LinkedList<String>();
        //add elements to the collection
        abs.add("January");
        abs.add("February");
        abs.add("March");
        abs.add("April");
        abs.add("May");

        //Display the collection
        System.out.println("AbstractCollection: " + abs);
        //Check if the collection contains March
        System.out.println("\nDoes the collection" + " contain 'March': " + abs.contains("March"));
        //Check if the collection contains August
        System.out.println("\nDoes the Collection" + " contain 'August': " + abs.contains("August"));
        //Check if the collection contains January
        System.out.println("\nDoes the Collection" + " contain 'January': " + abs.contains("January"));


    }
}
