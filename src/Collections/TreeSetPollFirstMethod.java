/// The pollFirst() method of TreeSet in Java, is used to retrieve and remove the first(lowest) element
/// or return null if this TreeSet is empty
/// Syntax: E pollFirst()
/// where e is the type of element maintained by this TreeSet container
/// Parameters: The function does not accept any parameter
/// Return Type: It returns the first element of the TreeSet if the TreeSet is not empty else it returns
/// null


package Collections;
import java.util.*;
public class TreeSetPollFirstMethod {
    public static void main(String[]args){
        //Create TreeSet
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //add elements into the TreeSet
        treeSet.add(0);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        //Before removing the element
        System.out.println("Before Removing " + "element from TreeSet: " + treeSet);
        //The first element is removed
        System.out.println("First Lowest Element " + "removed is: " + treeSet.pollFirst());
        System.out.println("After removing element" + " from TreeSet: " + treeSet);



    }
}
