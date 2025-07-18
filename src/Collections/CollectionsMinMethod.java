//min(Collection<?extends T>coll) = The min() method of java.util.Collections class is used to return
//the minimum element of the given collection according to natural ordering of elements

//All elements in the collection must implement Comparable Interface. Furthermore, all elements in the collection
//must be mutually comparable.(e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the collection
//This method iterates over the whole collection, hence it requires time proportional to the size of the collection

//public static <T extends Object & Comparable<? superT>> T min(Collection<? extends T> coll)

//Parameters: This method takes the collection coll as a parameter whose minimum element is to be determined
//Return Value: The method returns the minimum element of the given collection according to the natural ordering of elements

//Exception: This method throws NoSuchElementException if the collection is empty
package Collections;
import java.util.*;

public class CollectionsMinMethod {
    public static void main(String[]argv) throws Exception
    {
        try{
            //Create link list object
            List<Integer> arrlist = new LinkedList<Integer>();
            //populate the list
            arrlist.add(10);
            arrlist.add(20);
            arrlist.add(30);
            arrlist.add(40);
            arrlist.add(50);

            //print the list
            System.out.println("List:" + arrlist);
            //getting minimum value using min() method
            int min = Collections.min(arrlist);
            System.out.println("Minimum value is: " + min);
        }
        catch (NoSuchElementException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
