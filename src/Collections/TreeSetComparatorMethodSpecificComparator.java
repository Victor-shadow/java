package Collections;
import java.util.*;
//Helper class
class Helper implements Comparator<String>{
    //Method to compare two strings
    public int compare(String s1, String s2){
        String firstString;
        String secondString;

        firstString =s1;
        secondString=s2;
        //use compareTo() method
        return secondString.compareTo(firstString);
    }
}
public class TreeSetComparatorMethodSpecificComparator {
    public static void main(String[]args){
        //Create an Empty TreeSet of String Type
        TreeSet<String> treeSet = new TreeSet<String>();
        //add elements to the treeSet
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        //print the elements in the set before using comparator
        System.out.println("Set before using comparator: " + treeSet);
        //Create an empty TreeSet of String type with reference with
        //Helper class
        TreeSet<String> treeSet1 = new TreeSet<String>(new Helper());
        //add elements to the tree set
        treeSet1.add("A");
        treeSet1.add("B");
        treeSet1.add("C");
        treeSet1.add("D");
        treeSet1.add("E");
        //print the elements in the set before using comparator
        System.out.println("The elements sorted in descending order:" + treeSet1);

    }
}
