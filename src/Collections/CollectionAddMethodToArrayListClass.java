package Collections;
import java.util.*;
import java.io.*;

public class CollectionAddMethodToArrayListClass {
    public static void main(String[]args){
        Collection<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(5);
        //Print all the elements available in the list
        for(Integer number : arraylist){
        System.out.println("Number = " + number);

        }


    }
}
