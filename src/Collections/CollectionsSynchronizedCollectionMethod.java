//The synchronizedCollection() method in java.util.Collections class is used  to return a synchronized (thread-safe) collection backed by the specific collection
//In order to guarantee serial access, it is critical that all the access to the backing collection is accomplished through the returned collection
//Syntax:
//public static <T> Collection<T>
//synchronizedCollection(Collection<T> c)
//Parameters: This method takes collection c as a parameter to be "wrapped" in synchronized collection
//Return value: This method returns a synchronized view  of the specified collection

package Collections;
import java.util.*;
public class CollectionsSynchronizedCollectionMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Create a List Object
            List<String> vector = new ArrayList<String >();
            //populate the vector
            vector.add("A");
            vector.add("B");
            vector.add("C");
            vector.add("D");
            vector.add("E");
            //print the collection
            System.out.println("Collection: " + vector);
            //getting the synchronized view of the collection
            Collection<String> c =Collections.synchronizedCollection(vector);
            //print the collection
            System.out.println("Synchronized view: " + " collection " +  c);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
