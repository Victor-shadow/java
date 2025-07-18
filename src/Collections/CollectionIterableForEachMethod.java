//In Java, the foreach() method is the default method in the Iterable Interface
//It provides a simple way to iterate over all the elements of an iterable such as a List, Set using a lambda expressions or method reference



//Syntax
//default void forEach(Consumer<?super T> actions)
//Parameter: The action parameter is a Consumer<? super T> which is a special type of function that takes an item(of type T) and does something with it.
//but does not return anything
//The foreach() method uses this function to apply the action to each item in the iterable
//Return Value: This method does not return any value
//Exception: Throws NullPointerException if the input action is null


package Collections;
import java.util.*;
import java.io.*;
public class CollectionIterableForEachMethod {
    public static void main(String[]args){
        List<String> list = new ArrayList<String >();
        list.add("New Delhi");
        list.add("New York");
        list.add("Mumbai");
        list.add("London");

        Iterator<String> iteratorlist = list.iterator();
        while (iteratorlist.hasNext()){
            System.out.println(iteratorlist.next());
        }
    }
}
