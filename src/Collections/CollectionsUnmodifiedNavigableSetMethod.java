package Collections;
import java.util.*;

public class CollectionsUnmodifiedNavigableSetMethod
{
    public static void main(String[]args){
        NavigableSet<String> data = new TreeSet<String >();
        //add values in data
        data.add("Java");
        data.add("Kotlin");
        data.add("Ruby");
        data.add("R");
        //Create an unmodifiable set
        SortedSet<String> data2 = Collections.unmodifiableNavigableSet(data);
        //display
        System.out.println(data);
        //add to data
        data.add("Data Structures And Algorithms");
        //display data 2
        System.out.println(data2);

    }
}
