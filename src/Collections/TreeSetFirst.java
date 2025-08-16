package Collections;
import java.util.*;
public class TreeSetFirst {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //add() method to add elements into the set
        treeSet.add("Java");
        treeSet.add("Lynx");
        treeSet.add("Kotlin");
        treeSet.add("45");
        treeSet.add("100");
        treeSet.add("5");
        //Display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //display the lowest element of the set
        System.out.println("The first element is: " + treeSet.first());


    }
}
