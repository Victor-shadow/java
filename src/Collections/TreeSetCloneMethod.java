/// The java.util.TreeSet.clone() method is used to return a shallow copy of the mentioned TreeSet
/// It just creates a copy of the set
/// TreeSet.clone()
/// Parameters: The method does not take any parameters
/// Return Value:The function just returns a copy of the TreeSet


package Collections;
import java.util.*;
public class TreeSetCloneMethod {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //add() all elements to the treeSet
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        //display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //Create A New cloned set
        TreeSet cloned_set = new TreeSet();
        //clone the set using clone() method
        cloned_set = (TreeSet)treeSet.clone();
        //display the clone set
        System.out.println("The cloned TreeSet: " + cloned_set);

    }
}
