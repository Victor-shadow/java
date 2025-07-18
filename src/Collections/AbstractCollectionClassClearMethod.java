//The clear() method of JavaAbstractCollection is used to remove all elements from the collection
//This method does not delete the collection

//Syntax:
//AbstractCollection.clear()
//return value: The function does not return any value
package Collections;
import java.util.*;
import java.util.AbstractCollection;

public class AbstractCollectionClassClearMethod {
    public static void main(String[]args){
        //Create an Empty Collection
        AbstractCollection<Object> abs = new ArrayList<Object>();
        //use addMethod to add elements to the collection
        abs.add("January");
        abs.add("February");
        abs.add("March");
        abs.add("April");
        abs.add("May");

        //Display the Collection
        System.out.println("AbstractCollection: " + abs);
        //Clear the Collection
        abs.clear();
        //Display the Collection
        System.out.println("Abstract Collection " + " after using clear: " + abs);



    }
}
