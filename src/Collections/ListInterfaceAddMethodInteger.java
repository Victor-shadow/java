package Collections;
import java.util.*;
public class ListInterfaceAddMethodInteger {
    public static void main(String[]args){
        //Create an Empty list
        List<Integer> list = new ArrayList<Integer>(5);
        //add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        //add a new number '25' at index 2 and prints true if the
        //element is added successfully
        list.add(2,25);
        System.out.println("Element 25 added at index 2");
        //print elements of the list
        for (Integer i: list){
            System.out.println(i + " ");
        }


    }
}
