//The unmodifiableSet() method of java.util.Collections class is used to return an unmodifiable view of the specified set
//This method allows modules to provide users with "read-only" access to internal sets
//Query Operations on the returned set "read-through" to the specified set  and attempts to modify the returned set, whether direct or via its iterator results in an UnsupportedOperationException
//The returned set will be serializable if the specified set is serializable
//Syntax:
//public static <T> set<T> unmodifiableSet(Set <? extends T> S)
//Parameters: The method takes the set as its parameter for which an unmodifiable view is to be returned
//Return Type: The method returns an unmodifiable view of the specified set


package Collections;
import java.util.*;
import java.lang.Character;

public class CollectionsUnmodifiableSet {
    public static void main(String[]argv) throws Exception{
        try{
            Set<Character> data = new HashSet<Character>();
            //populate the data
            data.add('X');
            data.add('Y');
            //make the set unmodifiable
            Set<Character> immutableSet = Collections.unmodifiableSet(data);
            //print unmodified set
            System.out.println("Unmodifiable set: " + data);
        }
         catch (UnsupportedOperationException e){
            System.out.println("Exception thrown: " + e);
         }
    }

}
