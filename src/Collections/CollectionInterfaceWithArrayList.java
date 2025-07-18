package Collections;
import java.util.*;

public class CollectionInterfaceWithArrayList {
    public static void main(String[]args){
        //Create a Collection using an array list
        Collection<String> c = new ArrayList<>();
        //Add Elements to the collection
        c.add("Apple");
        c.add("Banana");
        c.add("Orange");
        c.add("Peach");
        System.out.println("Collection: " + c);

    }
}
