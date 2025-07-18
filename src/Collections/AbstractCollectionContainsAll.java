package Collections;
import java.util.*;

public class AbstractCollectionContainsAll {
    public static void main(String[]args){
        AbstractCollection<String> abs = new LinkedList<String >();
        //Use add method to add elements in the collection
        abs.add("January");
        abs.add("February");
        abs.add("March");

        //Create an empty collection
        AbstractCollection<String> abs2 = new LinkedList<String >();
        abs2.add("January");
        abs2.add("April");
        abs2.add("July");

        //Check if the collections contain the same element
        System.out.println("Both the collection same; " + abs.containsAll(abs2));

    }
}
