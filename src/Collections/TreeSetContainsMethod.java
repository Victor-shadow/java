/// TreeSet is one of the most important implementations of the SortedSet Interface in Java that uses a Tree for Storage
/// The ordering of the elements is maintained by a set uses their natural ordering whether or not an explicit
/// comparator is used. This must be consistent with equals if it is to correctly implement the Set Interface
/// This class provides numerous methods: The contains() method of the TreeSet class present inside java.util.package
/// is used to check if a specific element is present in the TreeSet or not
/// It is used to check if a TreeSet contains a particular element
/// Syntax: TreeSet.contains(Object element)
/// Parameters: The type of TreeSet. This is the element that needs to be checked if it is present in the TreeSet or not
/// Return value: A boolean value, true if the element is present in the set else it returns false
/// Exceptions:
/// NullPointerException: If the specified element is null
/// ClassCastException: If the specified element cannot be compared with the elements that currently exists in the set
package Collections;
import java.util.*;
public class TreeSetContainsMethod {
    public static void main(String[]args){
        //create an empty TreeSet of String type
        TreeSet<String> tree = new TreeSet<String>();
        //add elements into a treeSet
        tree.add("Java");
        tree.add("Kotlin");
        tree.add("C++");
        tree.add("C#");
        tree.add("Python");
        tree.add("Laravel");
        //display the TreeSet
        System.out.println("TreeSet: "+ tree);
        //check for the specific element in the TreeSet
        //object using contains() method
        //print a boolean value
        System.out.println("Does the set contain 'C++'? " + tree.contains("C++"));
        System.out.println("Does the set contain 'Python'? " + tree.contains("Python"));
        System.out.println("Does the set contain 'Golang'? " + tree.contains("Golang"));


    }
}
