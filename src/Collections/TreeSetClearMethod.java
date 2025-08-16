/// The java.util.TreeSet.clear() method is used to remove all elements from a Tree Set
/// Using the clear() method only clears all the elements from the set and not delete the set
///The clear() method is used to empty an existing TreeSet
/// Syntax: TreeSet.clear()
/// Parameters: The method does not take any parameter
/// Return value: The function does not return anything
package Collections;
import java.util.*;
public class TreeSetClearMethod {
    public static void main(String[]args){
        //Create an Empty Set
        TreeSet<String> treeSet = new TreeSet<String>();
        //use add() method to add elements to the Set
        treeSet.add("Java");
        treeSet.add("Laravel");
        treeSet.add("Scala");
        treeSet.add("Python");
        treeSet.add("Kotlin");
        //display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //clear() method
        treeSet.clear();
        //display the final tree
        System.out.println("After clearing treeSet: " + treeSet);
    }
}
