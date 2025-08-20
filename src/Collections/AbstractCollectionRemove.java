package Collections;
import java.util.AbstractCollection;
import java.util.LinkedList;

public class AbstractCollectionRemove {
    public static void main(String[]args){
        //Create an EmptyAbstractCollection
        AbstractCollection<String > abs = new LinkedList<String>();
        //add() method to the collection
        abs.add("Java");
        abs.add("Kotlin");
        abs.add("scala");
        abs.add("c");
        abs.add("ruby");

        //Display the collection
        System.out.println("Collection: " + abs);
        //remove elements
        abs.remove("c");
        abs.remove("scala");
        System.out.println("New Collection: " + abs);

    }

}
