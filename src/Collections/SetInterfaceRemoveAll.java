///  In Java, the removeAll() method is part of the Collection Interface
/// It is used to remove all elements from a collection that are present from another collection
/// Syntax:
/// boolean removeAll(Collection<c?>c)
/// Parameter: The collection "c" contains the elements to be removed from the calling collection
/// If an element in c matches any elements in the original collection, it will be removed
/// Return Type: This method returns "true" if the elements are removed, otherwise it returns "false"


package Collections;
import java.util.*;
public class SetInterfaceRemoveAll {
    public static void main(String[]args){
        //Add elements in the First Set
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Kotlin");
        set.add("Python");
        set.add("PHP");
        set.add("Scala");

        //add elements in the second set
        Set<String> set1 = new HashSet<>();
        set1.add("Java");
        set1.add("Kotlin");

        System.out.println("Set1 before removeAll(): " + set);
        //remove all elements of set2 from set1
        set.retainAll(set1);
        System.out.println("Set1 after removal: " + set);



    }
}
