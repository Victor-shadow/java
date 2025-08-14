package Collections;
import java.util.*;
public class ListInterfaceGet {
    public static void main(String[]args){
        //Create a List
        List<Integer> list = new ArrayList<Integer>();
        //add elements in a list
        list.add(10);
        list.add(20);
        list.add(30);

        //index
        int index = 2;
        //element at index
        int element = list.get(index);

        System.out.println("Element at index " + index + " : " + element);

    }
}
