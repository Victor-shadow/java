/// The lower(E element) method of TreeSet class in Java, it is used to return the greatest element
/// in this set which is strictly less than the given element
/// If no such element exists in this TreeSet collection, then this method returns NULL
/// Here E is the type of element maintained by this collection
/// Syntax: Public E lower(E element)
/// Parameter:It takes only one parameter element is the element based on which great value in the set
/// which is strictly less than this value is determined
/// Return value: It returns a value of type E  which is either null or the required value
/// Exceptions
/// ClassCastException: This method throws a ClassCastException if the specified element cannot be compared with the elements
/// of the set
/// NullPointerException:This method throws a NullPointerException if the given element is null and the set values
/// uses natural ordering or comparator does not permit null values
package Collections;
import java.util.*;
public class TreeSetLowerMethodNullPointerException {
    public static void main(String[]args){
        TreeSet<String> treeSet = new TreeSet<String>();
        try {
            //add elements to the TreeSet
            treeSet.add("Java");
            treeSet.add("Swing");
            treeSet.add("JavaFX");
            treeSet.add("Selenium");
            treeSet.add("Spring Boot");
            treeSet.add("Javax");

            System.out.println(treeSet.lower(null));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
