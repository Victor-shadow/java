package Collections;
import java.util.*;
public class ListInterfaceRemoveIndexMethodIntegers {
    public static void main(String[]args){
      //Declare an empty list of size 5
        List<Integer> list = new ArrayList<Integer>(5);
        //add elements to the list
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        //index from which to remove the element
        int i = 2;
        //Initial list
        System.out.println("Initial list: " + list);
        //remove element
        list.remove(i);
        //final list
        System.out.println("Final list: " + list);
    }
}
