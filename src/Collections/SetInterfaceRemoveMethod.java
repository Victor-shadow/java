///  The java.util.Set.remove(Object O) is used to remove a particular element from the set
/// Syntax: boolean remove(Object O)
/// Parameters: The parameter O is the type of element maintained by this Set and specifies the element to be removed
/// from this set
/// Return value: This method returns True if the specified element is present  in the Set otherwise it returns False


package Collections;
import java.util.*;
public class SetInterfaceRemoveMethod {
    public static void main(String[]args){
        //Create an Empty Set
        Set<String> set = new HashSet<>();
        //use add() method to add elements to the set
        set.add("Java");
        set.add("Kotlin");
        set.add("Python");
        set.add("Javascript");
        set.add("Scala");

        //display the set
        System.out.println("The set is: " + set);
        //Remove elements using remove method
        set.remove("Java");
        set.remove("Scala");
        set.remove("Kotlin");
        //Display the set after removal
        System.out.println("The set after removal of elements: " + set);


    }
}
