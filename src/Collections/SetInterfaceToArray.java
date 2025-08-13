/// In Java the toArray() method is used to convert the collection to an array
/// It returns an array containing all the elements in the collection in the correct order
/// Convert a set to an array
/// Syntax of toArray() method:
/// Object[] toArray();
/// Parameter: This method does not take any parameter
/// Return Type: This method returns an array of type object which contains all the elements
/// of the collection in the correct order

package Collections;
import java.util.*;
public class SetInterfaceToArray {
    public static void main(String[]args){
        //Create a Set of Strings
        Set<String> set = new HashSet<String>();
        //add elements to the set
        set.add("Java");
        set.add("Kotlin");
        set.add("C++");

        System.out.println("The set: " + set);
        //Convert the set to an Object array
        Object[] arr = set.toArray();
        System.out.println("The Array is:");
        for (Object obj: arr){
            System.out.println(obj + " ");
        }

    }
}
