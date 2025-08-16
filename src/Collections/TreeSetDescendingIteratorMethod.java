/// The descendingIterator() method of java.util.TreeSet<E> class is used to return an Iterator over the elements
/// in this set in descending order
/// Syntax: public Iterator descendingIterator()
/// Return value: The method returns an iterator over the elements in this set in descending order
package Collections;
import java.util.*;
public class TreeSetDescendingIteratorMethod {
    public static void main(String[]args) throws Exception{
        try{
            //Create a tree set object
            TreeSet<Integer> treeSet = new TreeSet<Integer>();
            //populate the TreeSet using add() method
            treeSet.add(10);
            treeSet.add(20);
            treeSet.add(30);
            treeSet.add(40);
            //print the TreeSet
            System.out.println("TreeSet: " + treeSet);
            //Create descendingIterator
            //using descendingIterator() method
            Iterator<Integer> iterator = treeSet.descendingIterator();

            System.out.println("\nValues using DescendingIterator:");
            //print the values
            while (iterator.hasNext()){
                System.out.println("Value: " + iterator.next());
            }
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
