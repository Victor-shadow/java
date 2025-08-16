/// The ceiling() method of java.util.TreeSet<S> class is used to return the least element in the set
/// greater than or equal to the given element, or null if there is no such element
/// Syntax: public E ceiling(E e)
/// Parameter: The method takes the value e as a parameter which is to be matched
/// Return value: The method returns the least element greater than or equal to e, or null if there is no
/// such element
/// Exception: This method throws NullPointerException  if the specified element is null and this set uses
/// natural ordering, or its comparator does not permit null elements

package Collections;
import java.util.*;
public class TreeSetCeilingMethod {
    public static void main(String[]args) throws Exception{
        try{
            //Create a tree set object
            TreeSet<Integer> tree = new TreeSet<>();
            //populate the tree set
            tree.add(10);
            tree.add(20);
            tree.add(30);
            tree.add(40);
            tree.add(50);
            //print the TreeSet
            System.out.println("Tree set: " + tree);
            //get ceiling value for '25'
            //using ceiling method
            int value = tree.ceiling(25);
            //print the ceiling value
            System.out.println("Ceiling value for 25: " + value);
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }


    }
}
