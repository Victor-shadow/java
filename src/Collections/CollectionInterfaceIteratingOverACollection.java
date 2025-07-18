package Collections;
import java.util.*;
public class CollectionInterfaceIteratingOverACollection {
    public static void main(String []args){
        //Create and Populate the list
        Collection<String > collection = new LinkedList<>();

        collection.add("Java");
        collection.add("Kotlin");
        collection.add("Scala");

        //Display the list
        System.out.println("The List is: " + collection);

        //Create an Iterator for the list
        Iterator<String > it = collection.iterator();
        //Display the values after iterate through the list
        System.out.println("\nThe iterator values" + " of list are:");
        while (it.hasNext())
        {
            System.out.println(it.next() + " ");
        }
    }

}
