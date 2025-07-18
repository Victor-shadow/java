package Collections;

import java.util.*;

public class CollectionsUnmodifiableSortedSetForInteger {
    public static void main(String[]args){
        SortedSet<Integer> data = new TreeSet<Integer>();
        //Add values in data
        data.add(100);
        data.add(200);
        data.add(300);
        data.add(500);
        //Create an Unmodifiable SortedSet
        SortedSet<Integer> data2 = Collections.unmodifiableSortedSet(data);
        //display the data
        System.out.println(data);
        //Add more integers
        data.add(700);
        data.add(800);
        //display
        System.out.println(data2);



    }
}
