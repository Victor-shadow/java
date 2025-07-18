package Collections;
import java.util.*;

public class CollectionsSortDescendingOrder {
    public static void main(String[]args){
        //Create a List of Strings
        ArrayList<String> array = new ArrayList<String >();
        array.add("Java");
        array.add("Kotlin");
        array.add("Cobol");
        array.add("Flutter");
        array.add("Python");
        //Collections.sort method is sorting the elements in the list in descending order
        Collections.sort(array, Collections.reverseOrder());
        //Print rsult
        System.out.println("List after the use of: " + " Collections.sort() method :\n" +array);

    }

}
