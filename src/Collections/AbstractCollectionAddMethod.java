//The add() method in java Abstract Collection is used to add a specific element in the collection
//This method will add the element only if the specified element is not present in the Collection or else the function will return false
//if the element is already present in the collection
//Syntax: AbstractCollection.add(Object element)

//parameters: The parameter element  is of the object type and refers to the element to be added to the collection
//Return value: This method returns true if the element is not present in the collection otherwise False id the element is already present in the collection
package Collections;
import java.util.*;
import java.util.AbstractCollection;

public class AbstractCollectionAddMethod {
    public static void main(String[]args){
        //Create an empty collection
        AbstractCollection<Object> abs = new ArrayList<Object>();
        //Use add(0 method to add elements to the collection
        abs.add("January");
        abs.add("February");
        abs.add("March");
        abs.add("April");
        abs.add("May");
        //Display the Collection
        System.out.println("Abstract Collection: " + abs);

    }

}
