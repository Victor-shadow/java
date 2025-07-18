package Collections;
import java.util.*;


public class CollectionsEmptyNavigationSetUnsupportedOperation {
    public static void main(String[]args){
        Set<String> data = Collections.<String>emptyNavigableSet();
        //Add three elements
        data.add("Orange");
        data.add("APPLE");
        data.add("Peaches");
        //print
        System.out.println(data);

    }
}
