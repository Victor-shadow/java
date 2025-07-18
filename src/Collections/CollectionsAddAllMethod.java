package Collections;
import java.util.*;

public class CollectionsAddAllMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Creation of Object of a List
            List<String> array =new ArrayList<String>();
            //Add Elements to an array
            array.add("A");
            array.add("B");
            array.add("C");
            array.add("D");
            //Printing array list before Operation
            System.out.println("array before operation: "+ array);
            //Add the Specified element to the specified collection
            //Using addAll() method
            boolean b = Collections.addAll(array, "1", "2", "3");
            //Printing ArrayList after operation
            System.out.println("array after operation: " + array);
        }
        catch(NullPointerException e){
            System.out.println("Exception thrown: " + e);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
