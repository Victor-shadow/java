/// The java.util.Set.contains() method is used to check whether the specific element is present in the Set or not
/// So basically it is used to check if a set contains a particular element
/// Syntax: boolean contains(Object element)
/// Parameter: The parameter element is of the type Set. This is the element that needs to be tested if it is present in the set or not
///The method returns true if the element is present in the set or else False
package Collections;
import java.util.*;
public class SetInterfaceContainsMethod {
    public static void main(String[]args){
        //Create an Empty Set
        Set<String> set = new HashSet<String>();
        //add elements into the set
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        //Display the set
        System.out.println("Set: " + set);
        //Check for Four in the set
        System.out.println("Does the set contain 'Four' ? " + set.contains("Four"));
        //check if One is in the set
        System.out.println("Does the set contain 'One' ? " + set.contains("One"));
        //check if seven is in the set;
        System.out.println("Does the set contain 'Seven' ? " + set.contains("Seven"));


    }
}
