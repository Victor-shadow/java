//The unmodifiableList() method of java.util.Collections class is used to return an unmodifiable view of the specified list
//This method allows modules to provide users with "read-only" access to internal lists
//Query operations on the returned list "read-through" to the specified list and attempts to modify the specified list
//whether direct or via its iterator results in an UnsupportedOperationException
//The returned list will be serializable if the specified list is serializable
//Similarly the returned list will implement RandomAccess if the specified list does

//Syntax:
//public static <T> listT> unmodifiableList(List<? extends T> list)
//parameter; this method takes the list as a parameter for which an unmodifiable viw is to be returned
//Return value: This method returns an unmodifiable view of the specified list
package Collections;
import java.util.*;
import java.lang.Character;
public class CollectionsUnmodifiableList
{
    public static void main(String[]argv) throws Exception{
        try{
            //Create an Object of Array List
            List<Character> list = new ArrayList<Character>();
            //populate the list
            list.add('X');
            list.add('Y');
            //print the list
            System.out.println("Initial List: " + list);
            //get unmodifiable list using unmodifiableList() method
            List<Character> immutableList = Collections.unmodifiableList(list);
            //print the list
            System.out.println("Immutable list: " + immutableList);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
