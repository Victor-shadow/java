//The synchronizedList() method of java.util.Collections class is used to return a thread safe synchronized list backed by a specified list
//In order to guarantee serial access, it is critical that all access to the specified list is accompanied through a returned list
//Syntax:
//public static <T> List<T> synchronizedList(List<T> list)

//parameters: This method takes the list as the parameter to be "wrapped"  in a synchronized list
//Return value: This method returns a synchronized view of the specified list
package Collections;
import java.util.*;

public class CollectionsSynchronizedListMethod {
    public static void main(String[]argv) throws Exception{
        try {
            //Create object of List
            List<String> vector = new ArrayList<String>();
            //populate the list
            vector.add("A");
            vector.add("B");
            vector.add("C");
            vector.add("D");
            vector.add("E");
            //PRINTING THE COLLECTION
            System.out.println("Collection: " + vector);
            //Create a Synchronized List
            List<String> mylist = Collections.synchronizedList(vector);
            //Print the collection
            System.out.println("Synchronized list: " + mylist);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
        }




}
