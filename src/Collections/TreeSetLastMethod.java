/// The java.util.TreeSet.last() method is used to return the last element of the TreeSet,
/// The last element being referred to the highest of the elements in the set
/// If the element is of Integer type, then the largest Integer is returned
/// If the element is of String type,then the elements are checked in alphabetical order and the string starting
/// with the last alphabets in the order of the dictionary is returned irrespective of length
/// Syntax:TreeSet.last()
/// Parameter: This method does not take any parameter
/// Return value: The method returns the highest member of the set. If the elements are of String type,
/// then they are checked in alphabetical order irrespective of length, and if the elements are of an Integer type,
/// then the largest integer is returned.The String of alphabetical order is given priority
package Collections;
import java.util.*;
public class TreeSetLastMethod {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //add() method to add elements to the set
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        //display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //display the highest element in the set
        System.out.println("The last element is: " + treeSet.last());
    }
}
