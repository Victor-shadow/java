/// The values can be removed from the Tree Set using the remove() method
package Collections;
import java.util.*;
public class TreeSetRemoveElements {
    public static void main(String[]args){
        //Create an Object of NavigableSet with reference to the TreeSet class
        NavigableSet<String> treeSet = new TreeSet<>();
        //Elements to be added using the add() method
        treeSet.add("Java");
        treeSet.add("Kotlin");
        treeSet.add("Python");
        treeSet.add("Scala");
        treeSet.add("C++");
        treeSet.add("C#");

        //print and display initial elements of the TreeSet
        System.out.println("Initial TreeSet: " + treeSet);
        //Remove a specific element specified from above
        treeSet.remove("Kotlin");
        //print the updated TreeSet
        System.out.println("After removing element: " + treeSet);
        //remove the first element using pollFirst() method
        treeSet.pollFirst();
        //print the Updated Set
        System.out.println("After removing First element: " + treeSet);
        //remove the last element using pollLast() method
        treeSet.pollLast();
        System.out.println("After removing last Element: " + treeSet);

    }
}
