package Collections;
import java.util.*;
//The enumeration() method of java.util.Collections class is used to return an enumeration over the specified collection
//This provides interoperability with legacy API's that require an enumeration as an input
//Syntax:
//public static Enumeration enumeration(Collection c);
//Parameters: This method takes Collection c as its parameter for which an enumeration is to be returned
//Return Value: This method returns an enumeration over a specified collection.

public class CollectionEnumerationMethod {
    public static void main(String[] argv) throws Exception {
        try {
            // 🧵 Create a list of Strings
            List<String> arraylist = new ArrayList<String>();

            // ➕ Add elements to the list
            arraylist.add("a");
            arraylist.add("b");
            arraylist.add("c");

            // 🖨️ Print the original list
            System.out.println("List: " + arraylist);

            // 🔁 Create an Enumeration from the list
            Enumeration<String> e = Collections.enumeration(arraylist);

            // 🖨️ Iterate and print values using Enumeration
            System.out.println("\nEnumeration over list:");
            while (e.hasMoreElements()) {
                System.out.println("Value is: " + e.nextElement());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e);
        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown: " + e);
        }
    }
}
