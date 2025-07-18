//The replaceAll() method in java.util.Collections class is used to replace all occurrence of one specified value in a list
//with another
//oldVal == null  ? e ==null : oldVal.equals(e)
//This method has no effect on the list size
//This method takes the following arguments as parameters
//oldVal = The old value to be replaced in the list
//newVal = The new value with which the oldVal is to be replaced
//list = the list in which the replacement is to occur
//Return value: This method returns true if the list contained one or more elements e  else false
//oldVal==null ? e==null :OldVal.equals(e);
//Syntax: public static boolean replaceAll(List, list, T, oldVal, T NewVal)

package Collections;
import java.util.*;

public class CollectionsReplaceAllMethod {
    public static void main(String[]argv) throws Exception{
        try{
            List<String> vector = new Vector<String>();
            //populate the vector object
            vector.add("A");
            vector.add("B");
            vector.add("A");
            vector.add("C");
            //print the vector
            System.out.println("Initial Vector: " + vector);
            //Replace values
            Collections.replaceAll(vector, "A", "Java");
            //print elements of the vector object
            System.out.println("Vector elements: " + vector);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }


}
