//The spliterator in Java Collection creates a spliterator over the elements in the collection
//It is an iterator that allows one to traverse the elements individually, but it is designed to work in parallel processing scenarios
//The difference between iterator and spliterator is that the spliterator supports parallel programming

//Syntax
//public Spliterator<E> Spliterator;
//Here E denotes the type of element to be stored inside the collection
//Return value
//It returns a spliterator across elements in a collection

package Collections;
import java.util.*;
public class CollectionSpliteratorMethod {
    //spliterator = it returns a spliterator across the element of the calling collection
    //tyrAdvance = it returns a boolean value . It returns true if there are more elements that exist otherwise false
    public static void main(String[]args){
        List<String> lista= new ArrayList<String >();
        lista.add("Kotlin");
        lista.add("Java");
        lista.add("Ruby");
        lista.add("Scala");

        Spliterator<String> spliterator = lista.spliterator();
        System.out.println("The list contains:" );
        while (spliterator.tryAdvance((element) -> System.out.println(element + " ")));
    }
}
