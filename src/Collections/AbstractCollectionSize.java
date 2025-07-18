package Collections;
import java.util.*;
import java.util.AbstractCollection;

public class AbstractCollectionSize {
    public static void main(String[]args){
        //Create an Empty AbstractCollection class
        AbstractCollection<String> abs = new LinkedList<String >();
        //Add elements to the collection
        abs.add("Java");
        abs.add("Kotlin");
        abs.add("Lynx");
        abs.add("React");
        abs.add("Ion");
        //Display the collection
        System.out.println("Collection" + abs);
        System.out.println("The size of the collection is: " + abs.size());



    }
}
