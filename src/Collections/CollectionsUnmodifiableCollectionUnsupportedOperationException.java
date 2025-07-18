package Collections;
import java.util.*;
import java.lang.Character;

public class CollectionsUnmodifiableCollectionUnsupportedOperationException {
    public static void main(String[]argv) throws Exception{
        try{
            List<Character> list = new ArrayList<Character>();
            //populate the list
            list.add('X');
            list.add('Y');
            //print the list
            System.out.println("Initial list: " + list);
            //getting unmodifiable list using unmodifiableCollection method
            Collection<Character> immutableList = Collections.unmodifiableCollection(list);
            //Adding element to new collection
            System.out.println("\nTrying to modify" + " the unmodifiable Collection");
            immutableList.add('Z');
        }
        catch (UnsupportedOperationException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
