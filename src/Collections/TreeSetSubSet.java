package Collections;
import java.util.*;
public class TreeSetSubSet {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //add the elements using add() method
        treeSet.add("One");
        treeSet.add("Two");
        treeSet.add("Three");
        treeSet.add("Four");
        treeSet.add("Five");
        treeSet.add("Six");

        //Create the subset tree
        TreeSet<String> treeSet1 = new TreeSet<String>();
        //limit values till 5
        treeSet1 = (TreeSet<String>) treeSet.subSet("4", "Five");
        //Create an Iterator
        Iterator iterator;
        iterator =treeSet1.iterator();
        //Display the treeSet data
        System.out.println("The resultant values within the subset: ");
        //iterate through the next subset
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }

    }
}
