/// The clear() method of the HashSet class is used to clear all the elements from the HashSet
/// This method makes the HashSet empty but does not delete the HashSet itself,
/// It simply removes all the elements and leaving the set ready for use
/// Syntax: void clear()
/// After calling the clear() method the HashSet size becomes zero
/// The clear() method does not affect the internal capacity of the HashSet


package Collections;
import java.util.*;
public class HashSetClearMethod {
    public static void main(String[]args){
        //Create a HashSet
        HashSet<Integer> hashSet = new HashSet<Integer>();
        //add elements to the hashSet
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println("HashSet before clear(): " + hashSet);
        //clear the hash Set
        hashSet.clear();
        System.out.println("HashSet after clear(): " + hashSet);
        System.out.println("HashSet is Empty(): " + hashSet.isEmpty());

    }
}
