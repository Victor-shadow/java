package Collections;
//the emptyNavigableSet() method of Java Collection is used to get the sets that has no elements
//=This method is used in set collection
//A set is a data structure that can store unique elements

//Syntax:
//public static final <T> Set<T> emptyNavigableSet
//It does not take any parameters
//It will return an empty navigable set that is immutable
import java.util.*;
public class CollectionsEmptyNavigationSet {
    public static void main(String[]args){
        //Empty navigable Set
        Set<String> data = Collections.<String>emptyNavigableSet();
        //Print statement
        System.out.println(data);

    }
}
