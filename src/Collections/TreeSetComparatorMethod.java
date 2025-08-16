/// TreeSet is one of the most important implementations of the SortedSet Interface in Java that uses a tree for storage
/// The ordering of the elements is maintained by the set using their natural ordering whether or not an explicit
/// comparator is provided.This must be consistent with the equals if it is to correctly implement the Set Interface
/// The comparator() method has been present inside java.util.TreeSet shares an important function of setting and returning
/// the comparator that can be used to order the elements in a TreeSet
/// The method returns Null value if the set follows the natural ordering patterns of the elements
/// Syntax: comp_set = (TreeSet)tree_set.comparator()
/// Parameters: This method does not take any parameters
/// Return Value: The comparator set is used to order the elements of the set in a specific order
/// It returns a Null value if the set follows a default or natural ordering pattern



package Collections;
import java.util.*;
public class TreeSetComparatorMethod {
    //main driver method
    public static void main(String[]args){
        //Create an empty tree set of an Integer type
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //add elements to the set using add() method
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(60);
        treeSet.add(80);
        treeSet.add(100);
        //print the elements inside a tree set
        System.out.println("Tree set values are: " + treeSet);
        //create a comparator
        Comparator comparator = treeSet.comparator();
        //print and display comparator values
        System.out.println("Since the comparator value is: " + comparator);
        //display message
        System.out.println("It follows naturaL Ordering");

    }
}
