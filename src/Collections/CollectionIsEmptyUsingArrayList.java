package Collections;
import java.util.*;
import java.io.*;

public class CollectionIsEmptyUsingArrayList {
    public static void main(String[]args){
        //Create an Empty array list with an initial capacity of 5
        Collection<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        //Print all elements available in the list
        System.out.println("Array List: " + arraylist);
        //Check if the list is empty using isEmpty method
        System.out.println("Is the ArrayList empty: " + arraylist.isEmpty());
        //Clear the ArrayList
        arraylist.clear();
        //print the new Array List
        System.out.println("The new Array List is: " + arraylist);
        System.out.println("Is the Array List empty: " + arraylist.isEmpty());

    }
}
