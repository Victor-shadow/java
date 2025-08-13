/// The java.util.Set.iterator() method is used to return the iterator of the same element as the set
/// The elements are returned in a random order from what is present in the set
/// Syntax: Iterator iterate_value = Set.iterator()
/// Parameters: This method does not take any arguments
/// Return value: The method iterates over the elements of the set and returns the values(Iterators)


package Collections;
import java.util.*;
public class SetInterfaceIteratorMethod {
    public static void main(String[]args){
        //Create an empty set
        Set<String> set = new HashSet<String>();
        //add elements into the set
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");
        set.add("Thursday");
        set.add("Friday");
        //display the set
        System.out.println("Set: " + set);
        //Create an iterator
        Iterator value = set.iterator();
        //display the values after iterating through the iterator
        System.out.println("The iterator values are: " );
        while (value.hasNext()){
            System.out.println(value.next());
        }

    }
}
