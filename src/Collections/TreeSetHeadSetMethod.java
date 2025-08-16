///TreeSet is one of the most important implementations of the SortedSet Interface in java that uses Tree for Storage
/// The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is
/// provided. This must be consistent with equals if it is to correctly implement the Set Interface
/// The headSet() method of TreeSet class has been present inside java.util package and is used as a limit setter
/// for a tree set, to return the elements upto to a limit defined in the parameter of the method in a sorted manner excluding the element
/// Syntax: head_set = (TreeSet)tree_set.headSet(Object element)
/// Parameter: the parameter element is of the type of the tree set and is the head point that is the limit upto which the
/// tree is allowed to return values excluding the element itself
/// Return value: The method returns the portion of the values in a sorted manner that is strictly less than the element mentioned in the parameter
/// Scenarios when implementing the TreeSet() method
/// in a sorted TreeSet
/// in an unsorted TreeSet
/// In an unsorted TreeSet but with a String type



package Collections;
import java.util.*;
public class TreeSetHeadSetMethod {
    //main driver method
    public static void main(String[]args){
        //Create an Empty TreeSet by declaring Object of TreeSet class
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //add the elements using add() method
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(300);
        treeSet.add(400);
        treeSet.add(500);
        //Create the headSet tree
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
        //limit values till 5
        treeSet1 = (TreeSet<Integer>) treeSet.headSet(30);
        //Create an Iterator
        Iterator itr;
        itr = treeSet1.iterator();

        //display the TreeSet data
        System.out.println("The resultant values till head set: ");
        //holds true till there is a single element
        //remaining in the object
        while (itr.hasNext()){
            //iterate through the headSet using next() method
            System.out.println(itr.next() + " ");
        }


    }
}
