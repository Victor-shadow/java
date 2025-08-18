/// The hashSet isEmpty() method in java is used to check if the HashSet is empty or not
/// syntax: boolean isEmpty()
/// Return Type: The method returns "true" if the HashSet is empty or else it returns "false"

package Collections;
import java.util.*;
public class HashSetIsEmptyMethod {
    public static void main(String[]args){
        //create a HashSet
        HashSet<String> hashSet= new HashSet<>();

        System.out.println("HashSet: " + hashSet);
        //check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());
        //add elements to the HashSet
        hashSet.add("Java");
        hashSet.add("Kotlin");
        hashSet.add("Scala");

        System.out.println("Updated HashSet: " + hashSet);
        //check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());
    }
}
