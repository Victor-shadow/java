package Collections;
import java.util.*;
class ArrayListClass {
    public static void main(String[]args){
        //Display an array list with an initial size of 'n'
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //append new elements at the end of the list
        for (int i = 1; i <= 5; i++)
            arrayList.add(i);

        //print elements
        System.out.println(arrayList);
        //remove element at i=3
        arrayList.remove(3);
        //display the ArrayList after deletion
        System.out.println(arrayList);
        //print elements
        for (int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i) + " ");

    }
}
