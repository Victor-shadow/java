//The unmodifiableCollection() method in java.util.Collections class is used to return an unmodifiable view
//of the specified collection
//This method allows modules to provide users with "read-only" access to internal collections
//Query operations on the returned collection "read-through" to the specified collection and attempts to modify the returned collection
//whether direct or via its iterator results in a UnsupportedOperationException
//The returned collection does not pass the hash code and equals operations through to the backing collection,but relies on Object Equals and hashCode methods
//This is necessary to preserve the contracts of these operations in the case that the backing collection is a set or a list
//The returned collection will be serializable if the specified collection is serializable

//Syntax:
//public static <T> Collection<T> unmodifiableCollection(Collection<? extends T> c)
//Parameters: The method takes collection as a parameter for which an unmodifiable view is to be returned
//Return Value: The method returns an unmodifiable view of the specified collection
package Collections;
import java.lang.Character;
import java.util.*;
public class CollectionsUnmodifiableCollectionMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //creating object of array List
            List<Character> list = new ArrayList<>();
            //populate the list
            list.add('X');
            list.add('Y');
            //print the list
            System.out.println("Initial list: " + list);
            //get unmodifiable list using unmodifiableCollection() method
            Collection<java.lang.Character> immutableList = Collections.unmodifiableCollection(list);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
