package Collections;
import java.util.*;
public class TreeSetLastMethodsString {
    public static void main(String[]args){
        //Create an empty tree set
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("W");
        treeSet.add("T");
        treeSet.add("G");
        treeSet.add("45");
        treeSet.add("90000000");
        treeSet.add("Z");

        //display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //display the highest element of the set
        System.out.println("The last element is: " + treeSet.last());

    }
}
