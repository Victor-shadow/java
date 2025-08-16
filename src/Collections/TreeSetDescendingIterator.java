package Collections;
import com.sun.source.tree.Tree;

import java.util.*;
public class TreeSetDescendingIterator {
    public static void main(String[]args) throws Exception{
        try {
            //create a tree set object
            TreeSet<String> treeSet = new TreeSet<String>();
            //populate the tree set using add() method
            treeSet.add("Java");
            treeSet.add("Kotlin");
            treeSet.add("C++");
            treeSet.add("C");
            treeSet.add("Python");
            //print the TreeSet
            System.out.println("TreeSet: " + treeSet);
            //create descending Iterator
            //using descendingIterator() method
            Iterator<String> iterator = treeSet.descendingIterator();
            System.out.println("\nValues using DescendingIterator:");
            //print the integrated value
            while (iterator.hasNext()){
                System.out.println("Value: " + iterator.next());
            }
        }
        catch (Exception e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
