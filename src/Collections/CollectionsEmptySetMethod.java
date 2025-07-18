package Collections;
import java.util.*;

//The emptySet() method is used to get the set that has no elements
//This method is used in set collections
//A set is a data structure that stores unique elements

//Syntax:
//public static final<T> Set<T> emptySet()
//The method takes no parameters
//It will return an empty Set that is immutable

public class CollectionsEmptySetMethod {
    public static void main(String[]args){
        //Create an empty set
        Set<String> data = Collections.<String>emptySet();
        //display
        System.out.println(data);
    }


}
