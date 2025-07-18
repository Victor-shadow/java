package Collections;
import java.util.*;
import java.util.AbstractCollection;

public class AbstractCollectionIsEmptyMethod {
    public static void main(String[]args){
        //Create an Empty Collection
        AbstractCollection<String > abs = new ArrayList<String >();
        //use add() method to add elements to the collection
        abs.add("Java");
        abs.add("Lynx");
        abs.add("Kotlin");
        abs.add("Html");
        abs.add("CSS");

        //Display the Collection
        System.out.println("Collection: " + abs);
        //Check for the empty Collection
        System.out.println("Is the Collection empty? : " + abs.isEmpty());
        //Clear the Collection
        abs.clear();
        System.out.println("Is the Collection Empty?: " + abs.isEmpty());


    }
}
