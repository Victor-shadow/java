package Collections;
import java.util.*;

public class CollectionClear {
    public static void main(String[]args){
        //Create an empty linked list
        Collection<String> collection = new LinkedList<>();
        //Use add()method to add elements to the list
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        //Output the present list
        System.out.println("the list is: " + collection);
        //Clear the linked list
        collection.clear();
        System.out.println("The new list is: " + collection);

    }
}
