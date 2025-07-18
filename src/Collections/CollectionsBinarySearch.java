package Collections;
import java.util.*;
//The java.util.Collections.binarySearch() method  is a java.util.Collections class method that returns
//the positon of an object in a sorted list

//Returns the index of key in a sorted list sorted in ascending order
//public static int binarySearch(List  slist, T key)
//Returns the index of the key in a sorted list  sorted in order defined by Comparator c
//public static int binarySearch(List slist, T key, Comparator c)
//If the key is not present, Then it returns "(-(insertion point) -1)".
//The insertion point is defined as the point at which the key will be inserted into a list
//The method throws ClassCastException if the element of the list are not comparable using the specified comparator, or the
//search key is not comparable with the elements
//Searching an int key in a list is sorted in ascending order

public class CollectionsBinarySearch {
    public static void main(String[]args){
        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(10);
        array.add(20);
        //10 is present at index 3
        int index = Collections.binarySearch(array, 10);
        System.out.println(index);

        //13 is not present. 13 will have been inserted at position 4. So the function returns(-4, -1)
        //which is -5
        index = Collections.binarySearch(array, 13);
        System.out.println(index);
    }

}
