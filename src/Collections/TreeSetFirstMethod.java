/// The java.util.TreeSet.first() method is used to return the first of the element of a TreeSet
/// The first element here is being referred to the lowest of the elements in the set
/// If the elements are of integer type, then the smallest integer is returned
/// If the elements are of string type, then the elements are checked in alphabetical order and the String
/// starting with the initial alphabets in the order of the dictionary is returned irrespective of length
/// Syntax: Tree_set.first();
/// Parameter: This method does not take any parameter
/// Return value:The method returns the lowest member in the set. If the element is a string, then they are checked in alphabetical order
/// irrespective of length, and if the elements are of an Integer type, then the smallest integer is returned
///also the number of String type, also hold higher priority
package Collections;
import java.util.*;
public class TreeSetFirstMethod {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //use add() method to add elements into the set
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);
        treeSet.add(400);
        treeSet.add(500);
        //display the TreeSet
        System.out.println("TreeSet: "+ treeSet);
        //display the lowest element of the set
        System.out.println("The first element is: " + treeSet.first());

    }
}
