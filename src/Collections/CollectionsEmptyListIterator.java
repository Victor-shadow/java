package Collections;

//The emptyListIterator() method of Java Collections is a method that is used to iterate through a list
//without any elements

//Syntax:
//public static <T>ListIterator<T> emptyListListener;
//The method has no parameters
//It will return a list with empty elements
//Exceptions: NoSuchElementException - This will occur when the given element is not found in the given collection
import java.util.*;
public class CollectionsEmptyListIterator {
    public static void main(String[]args){
        //Create a list Iterator
        ListIterator<String> iterator = Collections.emptyListIterator();
        //Get elements which are empty
        System.out.println(iterator.hasNext());
    }

}
