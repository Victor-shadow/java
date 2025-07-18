//The emptyEnumeration() method of Java Collections is used to get the empty enumeration that contains no elements in java
//Syntax:
//public static <T> Enumeration<T> emptyEnumeration();
//Parameters: This method has no parameters
//Return Type: This method will return an empty enumeration
//Exception: This method will not arise any exceptions

//Syntax
//object.hasMoreElements() = This will return a boolean value if the enumeration contains elements, it will return true otherwise false
package Collections;
import java.util.*;
public class CollectionsEmptyEnumeration {
    public static void main(String[]args){
        //create an empty enumeration
        Enumeration<String> object = Collections.emptyEnumeration();
        //check more elements or not
        System.out.println(object.hasMoreElements());
    }

}
