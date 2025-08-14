package Collections;
import java.util.*;
public class ListInterfaceEqualsMethodArrayList {
    public static void main(String[]args){
        //initialize a list of type ArrayList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //initialize another list
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        if (list.equals(list1))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");

    }
}
