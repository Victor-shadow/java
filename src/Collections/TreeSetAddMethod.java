/// The java.util.TreeSet.add() method in java TreeSet is used to add a specific element into the TreeSet
/// The function adds the element only if the specified element is not already present in the set else the Function
/// returns false if the element is not present in the set
/// Syntax: Tree_Set.add(Object element)
/// Parameters: The parameter element is of type TreeSet and, it refers to the element to be added  to the Set
/// Return value:The function returns True if the element is not present in the Set and new else it returns False


package Collections;
import java.util.*;
public class TreeSetAddMethod {
    public static void main(String[]args){
        //Create an empty TreeSet
        TreeSet<String> tree = new TreeSet<String>();
        //add() method to add elements
        tree.add("Java");
        tree.add("Kotlin");
        tree.add("Scala");
        tree.add("Python");
        tree.add("C++");
        tree.add("C#");

        //display the tree set
        System.out.println("Tree Set: " + tree);


    }
}
