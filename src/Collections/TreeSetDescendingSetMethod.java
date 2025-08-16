/// The descendingSet() method of java.util.TreeSet<E> class is used to return a reverse order view
/// of the elements contained in this set
/// The descending set is backed by this set, so changes in the set are reflected in the descending set
/// and vice versa. If either set is modified while an iteration over either set is in progress (except through the iterator's remove operation)
/// the result of the iteration is undefined
/// The returned set has an ordering equivalent to Collections.reverseOrder(comparator())
/// The expression s.descendingSet().descendingSet() returns a view of s essentially equivalent to s
/// Syntax: public NavigableSet descendingSet()
/// Return value: The method returns a reverse order view of the set
package Collections;
import java.util.*;
public class TreeSetDescendingSetMethod {
    public static void main(String[]args) throws Exception{
        try {
            //create the TreeSet
            TreeSet<String> treeSet = new TreeSet<String>();
            //populate the tree Set using add() method
            treeSet.add("A");
            treeSet.add("B");
            treeSet.add("C");
            treeSet.add("D");
            //print the TreeSet
            System.out.println("TreeSet: " + treeSet);
            //reverse order view of the elements
            //using descendingSet() method
            NavigableSet<String> treeReverse  = treeSet.descendingSet();
            //get an iterated view of the NavigableSet
            Iterator<String> iterator = treeReverse.iterator();
            System.out.println("\nValues using Descending set:");
            //print integrated value
            while (iterator.hasNext()){
                System.out.println("Value: " + iterator.next());
            }
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
