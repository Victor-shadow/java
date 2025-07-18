package Collections;

import java.util.AbstractCollection;
import java.util.TreeSet;
import java.util.*;

public class AbstractCollectionAddAllMethodForIntegers {
    public static void main(String[]args){
        //Create an empty collection
        Collection<Integer> collection = new TreeSet<>();

        //Adding elements to the collection
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);
        collection.add(500);

        //Display the Collection
        System.out.println("Collection 1: " + collection);
        //Create empty collection
        Collection<Integer> collection2 = new TreeSet<>();
        //Display the empty collection
        System.out.println("Collection 2 before (AddAll) " + collection2);
        //USING addALL METHOD TO COLLECTION 2
        collection2.addAll(collection);
        //Display thr collection after adding the element
        System.out.println("Collection 2 after (AddAll) " + collection2);


    }
}
