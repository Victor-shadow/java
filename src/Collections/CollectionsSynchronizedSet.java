//The synchronizedSet() method of java.util.Collections class is used to return a synchronized(thread-safe) set backed by the specified set
//In order to guarantee serial access, it is critical that the access to the backing set is accomplished through the returned set
//Syntax:
//public static <T> Set<T> synchronizedSet(Set<T> s)
//Parameters: This method takes the set as the parameter to be "wrapped"  in a synchronized set
//Return value: This method returns a synchronized(thread-safe) view of the specified set

package Collections;
import java.util.*;

public class CollectionsSynchronizedSet {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of set
            Set<String> set = new HashSet<String>();
            //populate the set
            set.add("1");
            set.add("2");
            set.add("3");
            //print the collection
            System.out.println("Set: " + set);
            //Create a Synchronized set
            Set<String> syncset = Collections.synchronizedSet(set);
            //print the set
            System.out.println("Synchronized set: " + syncset);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
