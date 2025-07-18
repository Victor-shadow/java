//the removeIf method of java collection removes all the elements of the calling collection that satisfy a given predicate which is passed as a parameter to a function
//If the predicate is true, then it removes the item from the calling collection otherwise it keeps the item in the collection
//Syntax:
//boolean removeIf(Predicate<? super E> filter);
//Parameter: Filter is a predicate that defines the condition for removal of the element
//It evaluates the items based on criteria and returns a boolean value
//Return Type: The remove if() method returns a boolean value . It returns true if the calling collection has removed any element or else it returns false
package Collections;
import java.util.*;
public class CollectionRemoveIfMethod {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //Print the original array list
        System.out.println("Original list: " + list);
        //Removes elements which are even
        list.removeIf(n -> n % 2 == 0);
        //Processed Array List
        System.out.println("List after removeIf() method: " + list);

    }

}
