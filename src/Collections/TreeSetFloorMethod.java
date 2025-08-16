/// The floor() method of java.util.TreeSet<E> classis used to return the greatest element
/// in this set less than or equal to the given element, or null if there is no such element
/// Syntax: public E floor (E e)
/// Parameters: This method takes the value e as a parameter which is to be matched
/// Return value: This method returns the greatest element less than or equal to e, or null if there is no such element
/// Exception: This method throws NullPointerException if the specified element is null and this set uses natural ordering,
/// or the comparator does not permit null elements

package Collections;
import java.util.*;
public class TreeSetFloorMethod {
    public static void main(String[]args) throws Exception{
        try {
            //Create a TreeSet object
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            //populate the treeSet using add() method
            treeSet.add(10);
            treeSet.add(20);
            treeSet.add(30);
            treeSet.add(40);
            //print the tree set
            System.out.println("TreeSet: " + treeSet);
            //get the floor value of 25
            //using floor() method
            int value = treeSet.floor(25);
            //print the floor value
            System.out.println("Floor value for 25: " + value);

        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }


    }
}
