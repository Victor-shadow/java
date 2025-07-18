package Collections;
//The emptyEnumeration() method of java collections is used to get the empty enumeration that contains no elements
//in java
//Syntax: public static <T> Enumeration<T> emptyEnumeration()
//This method has no parameters
//TThis method will return an empty enumeration
//This method will not arise any exceptions
import  java.util.*;


public class CollectionEmptyEnumerationMethod {
    public static void main(String[]args){
        //Create an Empty Enumeration
        Enumeration<String> object = Collections.emptyEnumeration();
        //Check More Elements or Not
        System.out.println(object.hasMoreElements());
    }
}
