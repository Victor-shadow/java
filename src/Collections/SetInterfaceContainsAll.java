///  The containsAll() method of Set in Java is used to check if a collection contains all the elements
/// of a specified collection. This method is part of the collection interface
/// Syntax: boolean containsAll(Collection<?>c)
/// Parameter: "c" is the collection whose elements are to be checked in the current collection
/// Return Type: This method returns "true" if the current collection contains all elements of another collection otherwise
/// returns "false"


package Collections;
import java.util.*;
public class SetInterfaceContainsAll {
    public static void main(String[]args){
    //create an empty set
        Set<String> set1 = new HashSet<String>();
        //add elements to the set
        set1.add("Spring");
        set1.add("Hibernate");
        set1.add("Swing");

        System.out.println("Set 1: " + set1);
        //Create another empty set
        Set<String> set2 = new HashSet<String>();
        set2.add("Spring");
        set2.add("Hibernate");
        set2.add("Swing");

        System.out.println("Set 2: " + set2);
        //Check if the set contains same elements
        System.out.println("Does set 1 contain set 2: " + set1.containsAll(set2));

    }
}
