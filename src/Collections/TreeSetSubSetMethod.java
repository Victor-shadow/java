/// The java.util.TreeSet.subSet() method is used to return a subset of the existing TreeSet
/// within a range mentioned in the parameter
/// The method takes an upper limit and a lower limit and returns all elements mentioned in the range
/// The lower limit is included if the element is present within the set and the upper limit is excluded
/// Basically, it takes the subset greater than or equal to the lower limit and strictly less than the upper element
/// Syntax: TreeSet tree_set.subSet(Object low_element, Object up_element)
/// Parameter: low_element:This is of the type of TreeSet and defines the lower limit or the starting element
/// from which is the subset is evaluated
/// This element is included in the Set
/// up_element: This is of the type of the TreeSet and defines the upper limit or the last element up to which the subset is evaluated
/// This element is excluded from the subset
/// Return value: The method returns a subset of the TreeSet type mentioned within the given range of parameters

package Collections;
import java.util.*;
public class TreeSetSubSetMethod {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<Integer> tree_set = new TreeSet<Integer>();
        //add the elements using tree_set
        tree_set.add(5);
        tree_set.add(1);
        tree_set.add(50);
        tree_set.add(10);
        tree_set.add(20);
        tree_set.add(6);
        tree_set.add(20);
        tree_set.add(18);
        tree_set.add(9);
        tree_set.add(30);
        //Create a subset tree
        TreeSet<Integer> sub_set = new TreeSet<Integer>();
        //limit values till 5
        sub_set = (TreeSet<Integer>) tree_set.subSet(6, 30);
        //Create an Iterator
        Iterator iterator;
        iterator = sub_set.iterator();
        //Display the tree set data
        System.out.println("The resultant value within the subset: ");
        //iterate through the subset
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}
