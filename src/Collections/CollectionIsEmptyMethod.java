//The isEmpty method of java.util.Collection interface  is used to check if the Collection upon which it is called is empty or not
//This method does return a boolean value indicating whether the collection is empty or not
//Syntax:
//boolean isEmpty()
//This method does not accept any parameters
//Return value: this method returns a boolean value,which indicates whether the collection is empty or not
//

package Collections;

import java.util.Collection;
import java.util.LinkedList;

public class CollectionIsEmptyMethod {
    public static void main(String[]args){
        //Create an Empty Linked List
        Collection<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Kotlin");
        linkedlist.add("Java");
        linkedlist.add("PHP");
        //Output the present list
        System.out.println();
        //Check if the list is empty using isEmpty() method
        System.out.println("Is the linked list Empty: " + linkedlist.isEmpty());

        //Clear the linked list
        linkedlist.clear();
        //Print the new list
        System.out.println("The new list is: " + linkedlist);
        //Check if the list is empty using isEmpty method
        System.out.println("Is the Linked List empty: " + linkedlist.isEmpty());


    }
}
