//The synchronizedNavigableSet() method in java collections is used to get the thread safe NavigableSet  within the given navigable set
//Syntax:
//public static <T> NavigableSet<T> synchronizedNavigableSet(NavigableSet<T> set)
//parameters = set is the input navigable set
//Return: It will return the synchronized navigable set from the given input(navigable set)
//Exception: It will not raise any exception
package Collections;
import java.util.*;
public class CollectionsSynchronizedNavigableSet {
    public static void main(String[]args){
        //Create a navigable tree set
        NavigableSet<String> data = new TreeSet<>();
        //add elements to the set
        data.add("spring hibernate");
        data.add("JavaFx");
        data.add("Java Database");
        data.add("Oracle");
        //get synchronized navigable set
        Set<String> finalList = Collections.synchronizedNavigableSet(data);
                //display
        System.out.println(finalList);

    }

}
