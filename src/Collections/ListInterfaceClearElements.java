package Collections;
import java.util.*;
public class ListInterfaceClearElements {
    public static void main(String[]args){
     //Create a list
        List<Integer> list = new ArrayList<Integer>();
        //add elements to the list
        list.add(1);
        list.add(2);
        //original list
        System.out.println("Original: " + list);
        //Clear the list
        list.clear();
        //print the list
        System.out.println("After operation: " + list);

    }
}
