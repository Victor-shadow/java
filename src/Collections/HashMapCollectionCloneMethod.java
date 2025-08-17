/// the clone() method of the HashMap class in Java is used to create a new shallow copy of the specified HashMap
/// The method returns a new HashMap that contains the same key-value mappings as the original HashMap
/// Syntax:public Object clone()
/// Parameter: The method does not take any parameter
/// Return value: The clone() method returns a Shallow copy of the HashMap
/// The clone() is shallow, means that the keys and values themselves are not cloned; but references to them are copied
/// Changes to mutable objects inside the HashMap will reflect in both the original and cloned HashMap

package Collections;
import java.util.*;
public class HashMapCollectionCloneMethod {
    public static void main(String[]args){
        //Create a HashMap and add key-value pairs
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Java");
        hashMap.put(2, "C++");
        hashMap.put(3, "Python");
        //print the original HashMap
        System.out.println("Original HashMap: " + hashMap);
        //clone the HashMap
        HashMap<Integer,String> hashMap1 = (HashMap<Integer, String>) hashMap.clone();
        //print the cloned HashMap
        System.out.println("The Cloned HashMap: " + hashMap1);

    }
}
