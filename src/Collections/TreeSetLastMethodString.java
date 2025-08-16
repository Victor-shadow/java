package Collections;
import java.util.*;
public class TreeSetLastMethodString {
    public static void main(String[]args){
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Html");
        treeSet.add("Css");
        treeSet.add("JavaScript");
        treeSet.add("Java");
        treeSet.add("Python");

        //display the TreeSet
        System.out.println("TreeSet: " +treeSet);
        //display the highest element of the set
        System.out.println("The last element is: " + treeSet.last());

    }
}
