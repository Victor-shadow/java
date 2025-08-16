/// The higher(E element) method of TreeSet class in Java is used to return the least element in the Set
/// which is strictly greater than the given element 'element'
/// If no such element is there, then this method returns NULL
/// Here Element  is the type of element maintained by this TreeSet collection
/// Syntax: public E higher(E element)
/// Parameters: It takes only one parameter: E It is the element based on which the least value in the set which is
/// strictly greater than this value is determined
/// Return: It returns a value of type which this TreeSet stores which is either null or the required values
/// Exceptions:
/// ClassCastException: The method throws a ClassCastException if the specified element cannot be compared with the elements
/// of the set
/// NullPointerException: The method throws a NullPointerException if the given element is null and the set uses a natural ordering
/// or the comparator does not permit null values

package Collections;
import java.util.*;
public class TreeSetHigherMethod {
    public static void main(String[]args){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println(treeSet.higher(15));

    }
}
