/// The values can be removed from a HashSet using remove() method

package Collections;
import java.util.*;
class HashSetCollectionRemoveElements {
    public static void main(String[]args){
        HashSet<String> hashSet = new HashSet<String>();
        //add elements to the set
        hashSet.add("Java");
        hashSet.add("Kotlin");
        hashSet.add("Scala");
        hashSet.add("Ruby");
        hashSet.add("Rust");
        hashSet.add("Python");
        hashSet.add("Javascript");
        hashSet.add("HTML");

        System.out.println("HashSet: " + hashSet);
        //Remove the element
        hashSet.remove("Scala");
        //print the updated HashSet element
        System.out.println("Updated HashSet: " + hashSet);
        //Returns false if the element is not present
        System.out.println("Scala exists in the Set: " + hashSet.remove("Scala") );


    }
}
