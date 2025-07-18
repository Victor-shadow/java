//The  unmodifiableNavigableSet() method will return an unmodifiable view of the given Navigation set
//This method is available in the NavigableSet. It is a data structure that can store elemetns in an order
//For this we use a tree set
//Syntax:
//NavigableSet<datatype> data = new TreeSet<String> ();
//where: datatype specifies the types of elements
//data is the input data

//Syntax:
//public static <T> NavigableSet <T> unmodifiableSortedSet(SortedSet<T> data)
//data is the navigable set which will be returned in an unmodifiable  view
package Collections;
import java.util.*;

public class CollectionsUnmodifiedNavigableSet {
    public static void main(String [] args){
        //create a set named data
        NavigableSet<Integer> data = new TreeSet<Integer>();
        //add values in the data
        data.add(1000);
        data.add(2000);
        data.add(3000);
        data.add(4000);
        //Create an Unmodifiable sort set
        SortedSet<Integer> data2 = Collections.unmodifiableNavigableSet(data);
        //display data
        System.out.println(data);
        //add to data
        data.add(32);
        //display data 2
        System.out.println(data2);
    }
}
