package Collections;

import java.util.*;

public class CollectionsNextEmptyIterator {
    public static void main(String[]args){
        //Create an empty iterator
        Iterator<String> i = Collections.emptyIterator();
        //Display the iterator next Element
        System.out.println(i.hasNext());

    }
}
