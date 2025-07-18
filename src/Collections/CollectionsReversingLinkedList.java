package Collections;
import java.util.*;

public class CollectionsReversingLinkedList {
    public static void main(String[]args){
        //list of Strings
        List<String> mylist = new LinkedList<String>();
        //Adding elements to the list
        mylist.add("January");
        mylist.add("February");
        mylist.add("March");
        mylist.add("May");
        //print elements  originally
        System.out.println("Original List: " + mylist);
        //use reverse() method to reverse the list
        Collections.reverse(mylist);
        System.out.println("Modified List: " + mylist);

    }

}
