package Collections;
import java.util.*;

//The emptyList() method of Java Collections returns the list with no elements.
//This method is immutable
//Syntax:
//public static final <T> List<T> emptyList();
//The method does not accept any parameters and returns an empty list
public class CollectionsEmptyListMethod {
    public static void main(String[]args){
        //Creating an empty list
        List<String> myList = Collections.<String>emptyList();
        //display the list
        System.out.println(myList);

    }
}
