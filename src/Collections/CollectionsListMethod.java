//The list() method of java.util.Collections class is used to return an array list containing the elements
//returned. by the specified enumeration in the order they are returned by the specified enumeration
//Syntax: public static ArrayList list(Enumeration e);
//This method takes Enumeration e as a parameter providing the elements for the returned array list
//Return value: This method returns an array list containing the elements returned by the specified enumeration

package Collections;
import java.util.*;

public class CollectionsListMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Create an Object of List
            List<String> arrlist = new ArrayList<String>();
            //Create an Object of vector
            Vector<String> v = new Vector<String >();
            //Adding elements to Vector
            v.add("A");
            v.add("B");
            v.add("C");
            v.add("D");
            v.add("E");
            //print the list
            System.out.println("Current List: " + arrlist);
            //Creating Enumeration
            Enumeration<String > e = v.elements();
            //getting arraylist of specified Enumeration
            arrlist =Collections.list(e);
            //Print arrayList
            System.out.println("Array List: " + arrlist);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
