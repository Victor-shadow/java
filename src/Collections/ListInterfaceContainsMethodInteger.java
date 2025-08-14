package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceContainsMethodInteger {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        //check the List contains 20
        System.out.println("List contains 10: " + list.contains(20));
        //check if the List contains 30
        System.out.println("List contains 30: " + list.contains(30));

    }
}
