package Collections;
import java.util.*;
public class ListInterfaceEqualsMethodInteger {
    public static void main(String[]args){
        //Initialize a list of type LinkedList
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(20);

        System.out.println(list);

        //initialize another list
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(20);

        System.out.println(list1);

        if (list.equals(list1))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
