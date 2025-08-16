package Collections;
import java.util.*;
public class TreeSetFirstMethodString {
    public static void main(String[]args){
        //Create an Empty TreeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        //use add() method to add elements into the Set
        treeSet.add("C++");
        treeSet.add("C#");
        treeSet.add("F#");
        treeSet.add("Java");
        treeSet.add("Kotlin");
        treeSet.add("Python");
        //display the TreeSet
        System.out.println("TreeSet: " + treeSet);
        //display the lowest element of the set
        System.out.println("The first element is: " + treeSet.first());


    }
}
