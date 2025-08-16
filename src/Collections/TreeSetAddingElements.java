/// To add elements to a TreeSet, use the add() method. Elements are stored in their ascending order, duplicates are ignored
/// and null values are not allowed
package Collections;
import java.util.*;
class TreeSetAddingElements {
    public static void main(String[]args){
        //Create a Set interface with reference to TreeSet class
        Set<String> set = new TreeSet<>();
        //Add Elements to the tree set
        set.add("Java");
        set.add("Kotlin");
        set.add("Scala");
        //print all elements inside the object
        System.out.println(set);


    }
}
