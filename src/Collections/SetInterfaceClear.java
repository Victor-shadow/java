/// The java.util.Set.clear() method is used to remove all elements from the Set
/// Using the clear() method only clears all the elements from the set and not delete the set
/// It only empties an existing set
/// Syntax: void clear()
/// Parameters: This method does not take any parameters
/// Return value: This method does not return any value

package Collections;
import java.util.*;
public class SetInterfaceClear {
    public static void main(String[]args){
        //Create an Empty Set
        Set<String> set = new HashSet<String>();
        //use add() method to add elements into the set
        set.add("Java");
        set.add("Kotlin");
        set.add("Python");
        set.add("PHP");
        set.add("Ruby");

        //Display the set
        System.out.println("The set: " + set);
        //Clear the set
        set.clear();
        //display the final set
        System.out.println("The final set: " + set);

    }
}
