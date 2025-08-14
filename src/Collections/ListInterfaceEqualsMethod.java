/// The listEquals() method is used to compare two lists.
/// It compares the lists, as both lists have the same size and all corresponding pairs of elements
/// in the two lists are equal
/// Syntax of equals method
/// boolean equals (Object o)
/// Parameter; This function has a single parameter which is an object to be compared for equality
/// The method returns true of the Lists are equal

package Collections;
import java.util.*;
public class ListInterfaceEqualsMethod {
    public static void main(String[]args){
        // Initializing a list of type Linkedlist
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(15);
        l.add(20);
        System.out.println(l);

        // Initializing another list
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(100);
        l2.add(200);
        l2.add(300);
        System.out.println(l2);

        if (l.equals(l2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
