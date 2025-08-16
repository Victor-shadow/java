/// The java.util.TreeSet.addAll(Collection C) method is used to append all of the elements from the mentioned collection
/// to the existing collection
/// The elements are added randomly without following any specific order
/// Syntax: boolean addAll(Collection C)
/// Parameters: The parameter C is a collection of any type that is to be added to the tree set
/// Return value: the method returns true if it successfully appends the elements of the collection C to the TreeSet
/// otherwise it returns False
package Collections;
import java.util.*;
public class TreeSetAddAllMethod {
    public static void main(String[]args){
        //Create an Empty Tree Set
        TreeSet<String> tree = new TreeSet<String>();
        //use add() method to add elements to the set
        tree.add("Java");
        tree.add("Scala");
        tree.add("Python");
        tree.add("C#");
        tree.add("C++");
        tree.add("Golang");
        //display the tree set
        System.out.println("Tree Set: " + tree);
        //Create another TreeSet
        TreeSet<String> tree1 = new TreeSet<String>();
        //add() method to add elements to the set
        tree1.add("Javascript");
        tree1.add("HTML");
        //use addAll method to append
        tree.addAll(tree1);
        //display the final tree
        System.out.println("Final treeSet: " + tree);

    }
}
