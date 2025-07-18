package Collections;
import java.util.*;
//The checkedCollection method of java.util.Collections  class is used to return a dynamically typesafe  view of the specified collection
//The returned collection does not pass the hashCode and equals operations through the backing collections but relies on
//the object equals and hash Code methods. This is necessary to preserve the contracts of these operations in the case of
//the backing collection is a set or a list. The returned collection will be serializable if the specified collection is serializable
//Since null is considered to be a value of any reference type, the returned collection permits the insertion of null elements
//whenever the backing collection does
//Syntax:
//public static Collection checkedCollection(Collection c, Class type);
//Parameters: The method takes two parameters
//The collection for which a dynamically typesafe view is to be returned
//The typ of element that c is permitted to hold
//Return Type:This method returns a dynamically typesafe view of the specified collection


public class CheckedCollectionClassForIntegerValue {
    public static void main(String[]argv) throws Exception{
        //Try block to catch the exception
        try {
            List<Integer> arraylist = new ArrayList<Integer>();
            //Adding elements to the array list
            arraylist.add(10);
            arraylist.add(20);
            arraylist.add(30);
            arraylist.add(40);
            arraylist.add(50);
            //Printing the above array list
            System.out.println("array List: " + arraylist);

            Collection<Integer> array = Collections.checkedCollection(arraylist, Integer.class);
            //Print the updated array list after above operation
            System.out.println("Typesafe view of the list: " + array);
            //Catch block to handle Exceptions
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
            //Display message if error occurs
            System.out.println("Exception thrown: " + e);
        }

    }

}
