/// The java.util.TreeSet.iterator()method is used to return an iterator of the same element as that of the TreeSet
/// The elements are returned in random order from what was present in the TreeSet
/// Syntax: Iterator iterate_values = TreeSet.iterator()
/// Parameter: The method does not take any parameter
/// Return Value: The method iterates over the elements of the TreeSet and returns the values(iterator)
package Collections;
import java.util.*;
public class TreeSetIteratorMethod {
 public static void main(String[]args){
     //Create an Empty TreeSet
     TreeSet<String> set = new TreeSet<String>();
     //use add() method to add elements to the TreeSet
     set.add("Monday");
     set.add("Tuesday");
     set.add("Wednesday");
     set.add("Thursday");
     set.add("Friday");
     //display the TreeSet
     System.out.println("TreeSet: " + set);
     //create an Iterator
     Iterator value = set.iterator();
     //display the values after Iteration
     System.out.println("The iterator values are:");
     while (value.hasNext()){
         System.out.println(value.next());
     }

 }
}
