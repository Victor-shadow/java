package Collections;
import java.util.*;

public class CollectionsEmptySortedSetWithException {
    public static void main(String[]args){
        Set<String> data = Collections.<String>emptySortedSet();

        //add three elements
        data.add("java");
        data.add("kotlin");
        data.add("python");
        //display
        System.out.println(data);

    }
}
