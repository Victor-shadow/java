/// The java.util.TreeSet.tailSet() method is used to set a point of start for a tree set,
/// to return all the elements greater than the element passed as a parameter mentioned to the method in a sorted manner
/// including the element(if the element is mentioned in the tree)
/// Syntax: TreeSet tail_set.tailSet(Object element)
/// Parameters: The parameter element is of the type TreeSet and it is the starting point from which the tree is allowed
/// to return values greater than the value mentioned in the parameter including the element
/// Return value: This method returns the portion of the values in a sorted manner  that is greater than the element mentioned
/// in the parameter, includes the parameters
package Collections;
import javax.swing.*;
import java.util.*;
public class TreeSetTailSetMethod {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //add the elements using add() method
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        //Create the tail_set tree
        TreeSet<Integer> tail_set = new TreeSet<Integer>();
        //limit the values till 5
        tail_set = (TreeSet<Integer>) treeSet.tailSet(10);
        //Create an Iterator
        Iterator iterator;
        iterator= tail_set.iterator();
        //Display the TreeSet data
        System.out.println("The resultant values from the tail: ");
        //Iterate through the TreeSet
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
