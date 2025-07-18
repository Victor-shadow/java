package Collections;
import java.util.*;

public class CollectionsEmptyEnumerationNextElement {
    public static void main(String[]args){
        //Create an Array List
        List<String> data = new ArrayList<String>();
        //Add elements to the list
        data.add("Java");
        data.add("Kotlin");
        data.add("Ruby");
        data.add("Rails");
        //Create Enumeration object
        Enumeration<String> object = Collections.emptyEnumeration();
        //get the elements
        while (object.hasMoreElements()){
            System.out.println(object.nextElement());
        }
        //display
        System.out.println("Empty");
    }
}
