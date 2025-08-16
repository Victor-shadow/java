/// The java.util.TreeSet.size() method is used to get the size of the Tree Set or the number of elements
/// present in the TreeSet
/// Syntax: TreeSet.size()
/// Parameters: This method does not take any parameter
/// Return value: The method returns the size or number of elements present in the set

package Collections;
import java.util.*;
public class TreeSetSizeMethod {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //add() method to add elements into the set
        treeSet.add("Java");
        treeSet.add("Kotlin");
        treeSet.add("Scala");
        treeSet.add("Python");
        treeSet.add("Laravel");
        treeSet.add("Rust");

        //display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //display the size of the set
        System.out.println("The size of the set is: " + treeSet.size());

    }
}
