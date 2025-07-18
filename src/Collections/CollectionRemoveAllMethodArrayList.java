package Collections;
import java.util.*;
import java.io.*;

class CollectionRemoveAllMethodArrayList {
    public static void main(String[]args){
        //Initialize list1
        List<Integer> list1 =new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.println("Original List: " + list1);
        //Initialize list 2
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(6);
        arraylist.add(7);
        arraylist.add(8);

        System.out.println("List containing elements to be removed from the calling collection");
        //Use remove all method
        boolean isRemoved = list1.removeAll(arraylist);
        System.out.println("Elements removed from the list: " + isRemoved);
        System.out.println("Modified list 1 after deletion: " + list1);

    }


}
