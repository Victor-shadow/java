package Collections;
import java.util.AbstractCollection;
import java.util.*;
public class AbstractCollectionClassContainsMethodBoolean {
    public static void main(String[]args){
        //Create an empty collection
        AbstractCollection<String > abs = new TreeSet<String>();
        //Use add method to add elements to the collection
        abs.add("Sweden");
        abs.add("Japan");
        abs.add("Iran");
        abs.add("Kiribati");
        abs.add("Cambodia");

        //Display the collection
        System.out.println("AbstractCollection: " + abs);
        //Check if the collection contains Sweden
        System.out.println("\nDoes the collection" + "contains 'Sweden': " + abs.contains("Sweden"));
        //Check if the collection contains Italy
        System.out.println("\nDoes the collection" + " contains 'Italy': " + abs.contains("Italy"));
        //Check if the collection contains Cambodia
        System.out.println("\nDoes the collection" + "Contains 'Cambodia' " + abs.contains("Cambodia"));
        //Check if the collection contains Japan
        System.out.print("\nDoes the collection" + " Contains 'Japan': " + abs.contains("Japan"));
    }
}
