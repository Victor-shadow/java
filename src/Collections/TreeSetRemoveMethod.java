/// The java.util.TreeSet.remove(Object o) method is used to remove a particular element from a Tree Set
/// Syntax: TreeSet.remove(Object O)
/// Parameters: The Parameter O is of the Type TreeSet and specifies the element to be removed
/// from the set
/// Return Value: The method returns True if the specified element in the parameter is initially present in the set
/// and is successfully removed otherwise it returns False


package Collections;
import java.util.*;
public class TreeSetRemoveMethod {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> tree = new TreeSet<String>();
        //use add() method to add elements to the tree
        tree.add("Java");
        tree.add("Kotlin");
        tree.add("C#");
        tree.add("C++");
        tree.add("C");
        tree.add("Python");
        //Display the TreeSet
        System.out.println("TreeSet: " + tree);
        //remove elements using remove() method
        tree.remove("C#");
        tree.remove("C++");
        tree.remove("C");
        System.out.println("New TreeSet: " + tree);

    }
}
