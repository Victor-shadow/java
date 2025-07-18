package Collections;
import java.util.*;

public class CollectionsEmptySetWithException {
    public static void main(String[]args){
        //Create an empty set
        Set<String> data = Collections.<String>emptySet();
        //add 3 elements
        data.add("A");
        data.add("B");
        data.add("C");
        //display
        System.out.println(data);


    }
}
