/// To add an element to the HashSet, we can use the add() method,
/// However, the insertion order is not retained in the HashSet
/// Duplicate elements are not allowed and all duplicate elements are ignored


package Collections;
import java.util.*;
class HashSetCollectionAddElements {
    public static void main(String[]args){
        //Create an Empty HashSet
        HashSet<String> hashSet = new HashSet<>();
        //add() method to add elements
        hashSet.add("Java");
        hashSet.add("Kotlin");
        hashSet.add("Scala");
        hashSet.add("Rust");
        hashSet.add("Golang");

        System.out.println("HashSet: " + hashSet);
    }
}
