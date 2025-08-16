package Collections;
import com.sun.source.tree.Tree;

import java.util.*;
public class TreeSetFloorMethodNullPointerException {
    public static void main(String[]args) throws Exception{
        try {
            //Create a TreeSet object
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            //populate the treeSet using add() method
            treeSet.add(10);
            treeSet.add(20);
            treeSet.add(30);
            treeSet.add(40);
            //Print the TreeSet
            System.out.println("TreeSet: " + treeSet);
            //get the floor value for null
            //using floor() method
            System.out.println("Trying to get" + " the floor value" + " for null");
            int value = treeSet.floor(null);
            //print the floor value
            System.out.println("Floor value for 25: " + value);
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
