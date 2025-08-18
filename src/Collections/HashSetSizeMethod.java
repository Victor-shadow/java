/// The HashSet size() method in java is used to get the size of the HashSet or the number of elements
/// present in the HashSet
/// Syntax: int size()
/// Return type; The method returns an integer that represents the number of elements currently
/// stored in the HashSet

package Collections;
import java.util.*;
public class HashSetSizeMethod {
    public static void main(String[]args){
        //Create a new HashSet
        HashSet<String> hashSet =new HashSet<>();
        //add elements to the hash set
        hashSet.add("Java");
        hashSet.add("Kotlin");
        hashSet.add("Scala");

        System.out.println("HashSet: "+ hashSet);
        //print the size of the HashSet
        System.out.println("Size of the hashSet: "+ hashSet.size());
        //add elements into the HashSet
        hashSet.add("Python");

        System.out.println("Updated HashSet: " + hashSet);
        //print the size of the HashSet
        System.out.println("Size of the updated HashSet: " + hashSet.size());
        hashSet.remove("Java");

        System.out.println("HashSet after removal of elements: "+ hashSet);
        //print the size of the HashSet
        System.out.println("Size of the HashSet after removal: " + hashSet.size());

    }
}
