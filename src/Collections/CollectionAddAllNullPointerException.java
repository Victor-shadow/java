package Collections;
import java.util.*;

public class CollectionAddAllNullPointerException {
    public static void main(String[] args) {
        //Create an Empty ArrayList
        Collection<String> collection = new ArrayList<String>();
        //A collection is created
        Collection<String> collect = null;
        //Display the list
        System.out.println("The Array list: " + collection);
        try {
            collection.addAll(collect);
        } catch (Exception e) {
            System.out.println("Exception " + e);

        }
    }
}
