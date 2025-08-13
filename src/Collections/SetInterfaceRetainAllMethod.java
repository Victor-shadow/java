///  In java, the retainAll() method is used to retain only the elements in a collection
/// that are also present in another collection
/// It modifies the current collection by removing elements that are not in the specified collection
/// Syntax: boolean retainAll(Collection<?>c)
/// This method takes collection as parameter
/// This method returns "true" if the current collection was modified by retaining common elements  otherwise return false


package Collections;
import java.util.*;
public class SetInterfaceRetainAllMethod {
    public static void main(String[]args){
        //Create two sets of Integers
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3,4,5,6,7));

        System.out.println("Set is: " + set);
        System.out.println("Set 1 is: " + set1);

        //retain only the elements in s1 that are also present in s2
        set.retainAll(set1);

        System.out.println("The modified set after retainAll() is: " + set);

    }
}
