//The toArray() method of Java collection returns an array containing elements that are inside the calling collection
//Syntax
//Object[]toArray();
//The return type is Object[](Array).
package Collections;
import java.io.*;
import java.util.*;


public class CollectionToArray {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Object[]array = list.toArray();
        System.out.println("The array contains:");

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }


    }
}
