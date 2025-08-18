/// The HashSet clone() method in java is used to return a Shallow copy of the given HashSet
/// It just creates a copy of the HashSet
/// Syntax: public Object clone()
/// Return type: It returns a new HashSet object that contains the same element as the original set


package Collections;
import java.util.*;
public class HashSetCloneMethod {
    public static void main(String[]args){
        //Create an Empty HashSet
        HashSet<String> hashSet = new HashSet<String>();
        //add elements into the set
        hashSet.add("Java");
        hashSet.add("Kotlin");
        hashSet.add("Python");
        hashSet.add("Scala");
        hashSet.add("Javascript");

        System.out.println("Initial Hashset: " + hashSet);
        //create a new cloned set
        HashSet hashSet1 = new HashSet();
        //clone the set
        hashSet1 = (HashSet) hashSet.clone();
        System.out.println("Cloned set: " + hashSet1);


    }
}
//the clone() method returns an object and casting it to the desired type is necessary when assigning to a HashSet variable
