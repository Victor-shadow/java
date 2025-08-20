/// In java, the toString() method is defined in the Object class, and it is inherited by all Java classes
/// It is used to return the String representation of an object
/// An Abstract Collection class is part of the Java Collections Framework, which overrides this method
/// to provide a String representation of the collection
/// Syntax of toString() method: public String toString()
/// Parameters: This method does not take any parameters
/// Return Type: This method returns a String representation of the collection
package Collections;
import java.util.*;
public class AbstractCollectionToString {
    public static void main(String[]args){
        AbstractCollection<String> abstractCollection = new ArrayList<>();
        abstractCollection.add("Java");
        abstractCollection.add("Kotlin");
        abstractCollection.add("Scala");

        System.out.println(abstractCollection.toString());


    }
}
