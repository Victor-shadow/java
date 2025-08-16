package Collections;
import java.util.*;
public class TreeSetHeadSetMethodUnsortedSet {
    //main driver method
    public static void main(String[]args){
        //Create an empty TreeSet
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        //add the elements using add() method
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(100);
        treeSet.add(40);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(15);
        treeSet.add(16);

        //Create the headSet
        TreeSet<Integer> head_set = new TreeSet<Integer>();
        //limiting values till five
        head_set = (TreeSet<Integer>) treeSet.headSet(30);
        //create an iterator
        Iterator iterator;
        iterator = head_set.iterator();
        //display the tree set data
        System.out.println("The resultant value till head set: ");
        //iterate through the headset
        while (iterator.hasNext()){
            //print the element
            System.out.println(iterator.next() + " ");
        }

    }
}
