/// To access elements use inbuilt methods like: contains(), first(), last()
package Collections;
import java.util.*;
public class TreeSetAccessingElements {
    public static void main(String[]args){
        //Create a NavigableSet Object with reference to the TreeSet
        NavigableSet<String> treeSet = new TreeSet<>();
        //add() elements to the TreeSet
        treeSet.add("Java");
        treeSet.add("C#");
        treeSet.add("C++");
        //print the elements inside the TreeSet Object
        System.out.println("Tree Set is: " + treeSet);

        String check = "C#";
        //check if the above string exists in the TreeSet or not
        System.out.println("Contains " + check + " " + treeSet.contains(check));
        //print the first element in the TreeSet
        System.out.println("The First TreeSet Element: " + treeSet.first());
        //print the last element in the TreeSet
        System.out.println("The Last TreeSet Element: " + treeSet.last());

        String value = "Java";
        //find the values that are greater or smaller than the above String
        System.out.println("Higher: " + treeSet.higher(value));
        System.out.println("Lower: " + treeSet.lower(value));



    }
}
