/// The add() method of Set in Java is used to add a specific element into a set collection
/// The set add() function adds the element only if the specified element is not already present
/// in the set, else the function returns false if the element is already present in the set
/// Declaration of add() method
/// boolean add(E element)
/// where E is the type of element maintained by this set collection
/// Parameters: The parameter element is the type of element maintained by this set, and it refers
/// to the element to be added to the set
/// Return Value: The function returns True if the element is not present in the set and is new
/// else it returns False if the element is already present in the set

package Collections;
import java.util.*;
public class SetInterfaceAdd {
   public static void main(String[]args){
       //Create an empty set
       Set<String > set = new HashSet<>();
       //use add() method to add elements into the set
       set.add("Java");
       set.add("Kotlin");
       set.add("C++");
       set.add("C#");
       set.add("Python");
       set.add("Javascript");
       //display the set
       System.out.println("Set: " + set);
   }

}
