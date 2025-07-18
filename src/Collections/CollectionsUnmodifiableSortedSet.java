//The unmodifiableSortedSet() method in java.util.Collections is available in the tree set
//it is used to get an unmodifiable view of the specified sorted set
//Syntax:
//public static <T> SortedSet<T> unmodifiableSortedSet(SortedSet<T> data)
//where data is the sorted set that is returned in an unmodifiable view
//Return type: This method returns an Unmodifiable view of the specified Sorted set
//A tree set is a data structure that can store elements in order

//Syntax:
//SortedSet<datatype> data = new TreeSet<String>();
//where:
//datatype specifies the type of elements
//data is the input data

//
package Collections;
import java.util.*;
public class CollectionsUnmodifiableSortedSet {
    public static void main(String[]args){
        //Create a set
        SortedSet<String> data = new TreeSet<String>();
        //Add values in the data
        data.add("Java");
        data.add("Python");
        data.add("Kotlin");
        data.add("Javascript");
        //Create an Unmodifiable sortedSet
        SortedSet<String> finalset = Collections.unmodifiableSortedSet(data);
        //display
        System.out.println(data);
        //add to data
        data.add("PHP");
        //display
        System.out.println(finalset);

    }

}
