/// The java.util.Set.size() method is used to get the size of the Set or the number of elements present in the set
/// Syntax: int size()
/// Parameters: This method does not take any parameters
/// Return value: This method returns the size or the number of elements present in the set

package Collections;
import java.util.*;
public class SetInterfaceSizeMethod {
    public static void main(String[]args){
        //Create an Empty Set
        Set<String> set = new HashSet<String>();
        //use add method to add elements to the set
        set.add("Java");
        set.add("Kotlin");
        set.add("Python");
        set.add("Javascript");
        set.add("Scala");
        //display the set
        System.out.println("The set is: " + set);
        //Display the size of the set
        System.out.println("The size of the set is: " + set.size());

    }
}
