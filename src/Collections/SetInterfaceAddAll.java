/// In Java, the addAll() method of the Set class is used to add all the elements of a specified collection
/// to the current collection
/// The elements are added randomly without following a specific order
/// Syntax: boolean addAll(Collection<? extends E>c)
/// Parameter: this method takes collection as an argument, which can be any subclass of the collection interface
/// This method returns "true" if the element were added successfully otherwise returns "false"

package Collections;
import java.util.*;
public class SetInterfaceAddAll {
    public static void main(String[]args){
        //Create an Empty Set
        Set<String > set1 = new TreeSet<String>();
        //add elements into the set
        set1.add("Java");
        set1.add("Python");
        set1.add("kotlin");
        //display the set
        System.out.println("The set: " + set1);
        //Create another set
        Set<String> set = new TreeSet<String>();
        //use add method to add elements into the set
        set.add("C#");
        set.add("C++");
        //use addAll() method to append
        set1.addAll(set);
        //display the final set
        System.out.println("Final set: " + set1);


    }
}
