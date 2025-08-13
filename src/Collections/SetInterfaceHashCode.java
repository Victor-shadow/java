/// In java, the hashCode() method is defined in the Object class and is used to generate the HashCode for objects
/// It plays an important role in hash-based collections; HashTables, HashMap, HashSet
/// Syntax: public int hashCode()
/// Parameter: this method does not take any parameter
/// The method returns an int value

package Collections;
import java.util.*;
public class SetInterfaceHashCode {
    public static void main(String[]args){
        //Create a set
        Set<Integer> set = new HashSet<Integer>();
        //use add to insert the elements
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        System.out.println("Set: " + set);
        //Get the hashCode() value
        System.out.println("HashCode value: " + set.hashCode());

    }
}
