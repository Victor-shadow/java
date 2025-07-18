package Collections;

import java.util.*;

public class CollectionClearMethodArrayList {
    public static void main(String[]args){
        //Create an empty array list
        Collection<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);
        //print all elements available in the list
        System.out.println("Array List: " + arrlist);
        //Clear the Array;
        arrlist.clear();
        System.out.println("New ArrayList: " + arrlist);

    }
}
