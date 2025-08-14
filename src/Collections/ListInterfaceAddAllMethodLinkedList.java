package Collections;
import java.util.*;
public class ListInterfaceAddAllMethodLinkedList {
    public static void main(String[]args){
        //initialize a LinkedList
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //Initialize a collection to be appended to the list
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        System.out.println(arrayList);

        list.addAll(arrayList);

        System.out.println(list);


    }
}
