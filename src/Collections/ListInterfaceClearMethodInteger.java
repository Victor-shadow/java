package Collections;
import java.util.*;
public class ListInterfaceClearMethodInteger {
    public static void main(String[]args){
        //Create an Empty List with Initial capacity
        List<Integer> list = new ArrayList<Integer>(3);
        //use add method to add elements initially to the list
        list.add(10);
        list.add(20);
        list.add(30);
        //original list
        System.out.println("Original list: " + list);
        //remove elements from the list
        list.clear();
        //print the final list
        System.out.println("After Operation: " + list);

    }
}
