package Collections;

import java.util.*;

public class CollectionAddAllArrayListClass {
    public static void main(String[]args){
        //Create an empty ArrayList
        Collection<String> arraylist = new ArrayList<String>();
        //Create another array list
        Collection<String> arrlist = new ArrayList<String>();
        //Add elements to this collection
        arrlist.add("Kotlin");
        arrlist.add("Ruby");
        arrlist.add("Java");
        arrlist.add("Scala");
        //Display the arrlist
        System.out.println("The array list: " + arraylist);
        //Add all method
        arraylist.addAll(arrlist);
        System.out.println("The new array list: " + arraylist);
    }
}
