//max(Collection<? extends T> coll)
//The max() method of the java.util.Collections class is used to return the maximum element of the given collection
//according to natural ordering of collections
//All elements in the Collection must implement Comparable Interface. Furthermore, all the elements in the collection must
//be mutually comparable(e1.compareTo(e2) must not throw a ClassCastException for any elements e1 and e2 in the collection
//This method iterates all the collection elements, hence it requires time proportional to the size of the collection

//Syntax:
//public static <T extends Object & Comparable> T max(Collection coll)

//Parameters:
//This method takes the collection coll as the parameter whose maximum element is to be determined
//Return value: This method returns the maximum element of the given collection, according to natural ordering of elements
//This method throws the following exceptions:
//ClassCastException = if the collection contains elements that are not mutually comparable, (strings and integers)
//NoSuchElementException = If the collection is empty

//public static T max(Collection<? extends T> coll, Comparator<? superT> comp)
//The max() method of the java.util.Collections class is used to return the maximum element of the given Collection
//according to the order induced by the  specified Comparator

//Parameters: This method takes the following argument as a parameter
//
//        coll - the collection whose maximum element is to be determined.
//        comp - the comparator with which to determine the maximum element. A null value indicates that the elements' natural ordering should be used.
package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class CollectionsMaxMethod {
    public static void main(String[]argv) throws Exception{
        try{
            //Creating object of LinkedList
            List<Integer> list = new LinkedList<Integer>();
            //Adding elements to v
            list.add(-1);
            list.add(4);
            list.add(-5);
            list.add(1);
            //printing the max value
            System.out.println("Max Value: " + Collections.max(list));
        }
        catch (ClassCastException e){
            System.out.println("Exception thrown: " + e);
        }
        catch (NoSuchElementException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
