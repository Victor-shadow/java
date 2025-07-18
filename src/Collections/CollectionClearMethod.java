//The Collection clear method of Java collection interface clears the collection upon which it is called
//After the method is called the collection will be empty as it removes all elements from the collection
//The method does not take any parameter and does not return any value

//Syntax: Collection.clear()
//Exceptions: UnsupportedOperationException: If the add operation is not supported by this collection


package Collections;
import java.util.*;

public class CollectionClearMethod {
    public static void main(String[]args){
        //Create an array list and initialize with some values
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2","3","4"));
        //Display the list before clearing
        System.out.println("List before clearing:" + list);
        //Clear the list
        list.clear();
        //Display the list after clearing
        System.out.println("List after clearing: " + list);

    }
}
