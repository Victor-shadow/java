package Collections;
import java.util.*;
public class TreeSetPollFirstMethodString {
    public static void main(String[]args){
        //Create TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //remove the element when the tree set is empty
        System.out.println("pollFirst() method when " + "Tree Set is empty : " + treeSet.pollFirst());
        //add elements to the treeSet
        treeSet.add("Java");
        treeSet.add("Kotlin");
        treeSet.add("Python");
        //before removing element
        System.out.println("Before removing element from" + " TreeSet: " + treeSet);
        //The first element is removed
        System.out.println("First lowest element removed is: " + treeSet.pollFirst());
        System.out.println("After removing element " + "from TreeSet: " + treeSet);

    }
}
