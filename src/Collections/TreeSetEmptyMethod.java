/// The java.util.TreeSet.isEmpty() method is used to check and verify if a TreeSet is empty or not
/// It returns True if a TreeSet is empty or else it returns False
/// Syntax: TreeSet.isEmpty()
/// Parameter: The method does not accept any parameter
/// Return value:The function returns true if the set is empty or else false


package Collections;
import java.util.*;
public class TreeSetEmptyMethod {
    public static void main(String[]args){
        /// Create an Empty TreeSet
        TreeSet<String> tree = new TreeSet<String>();
        //use add() method to add elements to the TreeSet
        tree.add("Java");
        tree.add("Kotlin");
        tree.add("Scala");
        tree.add("Python");
        tree.add("Ruby");
        /// display the TreeSet
        System.out.println("TreeSet: " + tree);
        //check for empty Set
        System.out.println("Is the tree set empty? " + tree.isEmpty());
        //Clear the set using clear() method
        tree.clear();
        //check for the empty Set
        System.out.println("Is the set empty? " + tree.isEmpty());
    }
}
