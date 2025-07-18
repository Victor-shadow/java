//The remove(E e)  and removeAll(Collection c) methods can be used to remove a particular element or a collection of elements from a collection
package Collections;
import java.util.*;
public class CollectionInterfaceRemovingElementsFromACollection {
    public static void main(String[]argv) throws Exception{
        //Create object of hashset
        Collection<Integer> hashset = new HashSet<Integer>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        hashset.add(5);

        System.out.println("Initial set: " + hashset);
        //Remove a particular element
        hashset.remove(4);
        System.out.println("Set after removing 4: " + hashset);
        //Create another object of hashSet
        Collection<Integer> hashset2 = new HashSet<Integer>();
        hashset2.add(1);
        hashset2.add(2);
        hashset2.add(3);

        System.out.println("Collection Elements to be removed: " + hashset2);
        hashset.removeAll(hashset2);
        System.out.println("Set 1 after removeAll()  operation: " + hashset);

    }
}
