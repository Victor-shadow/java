package Collections;
import java.util.*;
public class ListInterfaceLastIndexOfMethodInteger {
    public static void main(String[]args){
        //initialize a list of type LinkedList
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(3);

        System.out.println(list);
        System.out.println("Index of 3: " + list.lastIndexOf(3));

    }
}
