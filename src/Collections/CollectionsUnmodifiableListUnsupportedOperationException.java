package Collections;

import java.util.ArrayList;
import java.util.*;
import java.lang.Character;

public class CollectionsUnmodifiableListUnsupportedOperationException {
    public static void main(String[]argv) throws Exception{
        try{
            List<Character> list = new ArrayList<Character>();
            //populate the list
            list.add('X');
            list.add('Y');
            //print list
            System.out.println("Unmodifiable List: " + list);
            List<Character> newList = Collections.unmodifiableList(list);
            //Adding element to new Collection
            System.out.println("\nTrying to modify" + " unmodifiableList");
            newList.add('Z');
        }
        catch (UnsupportedOperationException e){
            System.out.println("Excption thrown: " + e);
        }
    }
}
