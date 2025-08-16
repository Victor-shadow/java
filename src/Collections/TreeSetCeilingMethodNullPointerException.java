package Collections;

import java.util.TreeSet;

public class TreeSetCeilingMethodNullPointerException {
    public static void main(String[]args)throws Exception {
        try{
            //Create tree set Object
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            //populate the TreeSet
            treeSet.add(10);
            treeSet.add(20);
            treeSet.add(30);
            treeSet.add(40);
            treeSet.add(50);
            //print the tree set
            System.out.println("Tree set: " + treeSet);
            //get ceiling value for null
            //using ceiling() method
            System.out.println("Trying to compare" + " with null values");

            int value = treeSet.ceiling(null);
            //print the ceiling value
            System.out.println("Ceiling value for null: " + value);
        }
        catch (NullPointerException e){
            System.out.println("Exception: " + e);
        }

    }
}
