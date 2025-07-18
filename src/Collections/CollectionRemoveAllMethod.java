//The removeAll method of java collection removes those elements in the collection that are contained in the collection
//which is given as an argument to a function
//Syntax
//boolean removeAll(Collection<?> c);
//Parameters: c is the collection containing elements that are removed from the calling collection
//Return Type: The return value is a boolean true if the calling collection was modified by the removeAll method else it returns false

package Collections;
import java.util.*;
import java.io.*;
public class CollectionRemoveAllMethod {
    public static void main(String[]args){
        Collection<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //print
        System.out.println("The original list: " + list);
        //Collection
        Collection<Integer> list2 = new ArrayList<Integer>();
        list2.add(7);
        list2.add(8);

        System.out.println("List containing elements to be removed from the calling collection: " + list2);
        boolean isRemoved = list.removeAll(list2);
        System.out.println("Elements removed from list 1: " + isRemoved);
        System.out.println("Modified list 1 after deletion: " + list);


    }

}
