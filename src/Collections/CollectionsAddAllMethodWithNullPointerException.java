package Collections;
import java.util.*;
//The addAll() method of java.util Collection class is used to add all the specified elements to the
//specified collection. Elements to be added may be specified individually or as an array
//The behaviour of the convenience method is identical to that of the c.addAll(Arrays.asList(elements))
//Syntax:
//public static boolean addAll(Collection c, T... elements)
//The method takes the following arguments as parameters
//c: The collection into which the elements are to be inserted
//elements: The elements to be inserted at c
//Return value: This method returns true if the collection changed as a result of the call
//Exception: This method throws NullPointerException if elements contain one or more null values and c
//does not permit null elements, or if c elements are null

public class CollectionsAddAllMethodWithNullPointerException {
    public static void main(String[]argv) throws Exception{
        try{
            List<String> array =new ArrayList<String>();
            //Adding elements to array List
            array.add("1");
            array.add("2");
            array.add("3");
            array.add("Country");
            //printing array list before operations
            System.out.println("array before operation: " + array);
            //Add the specified element to the specified collection
            //using addAll() method
            System.out.println("\nTrying to add the null value with the array List");
            boolean b = Collections.addAll(null, array);
            //printing results after operation
            System.out.println("array after operation: " + array);
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
