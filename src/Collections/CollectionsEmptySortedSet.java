package Collections;
import java.util.*;

//The emptySortedSet() method of Java collection is used to get the set that has no elements.
//The method is used in set collection
//A set is a data structure that stores unique elements in a sorted manner

//Syntax:
//public static final <T> Set <T> emptySortedSet();
//The method takes no parameters
//It will return an empty set that is immutable


public class CollectionsEmptySortedSet {
    public static void main(String[]args){
        //Create an emptySorted set
        Set<String> data = Collections.<String>emptySortedSet();

        //display
        System.out.println(data);

    }

}
