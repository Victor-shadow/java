package Collections;
import java.util.*;
public class TreeSetTailSetMethodUnsortedSet {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //add the elements
        treeSet.add("Java");
        treeSet.add("Spring");
        treeSet.add("Jakarta");
        treeSet.add("Hibernate");
        treeSet.add("JavaFX");
        //Create the tail_set tree
        TreeSet<String> tail_set = new TreeSet<String>();
        //limit values till 5
        tail_set =(TreeSet<String>) treeSet.tailSet("Spring");
        //Create an Iterator
        Iterator iterator;
        iterator = tail_set.iterator();
        //display treeSet data
        System.out.println("The resultant value from the tail:");
        //iterate through the tailSet
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }

    }
}
