package Collections;
import java.util.*;
public class LinkedListCollectionToArray {
    public static void main(String[]args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);

        System.out.println("Linked List: " + linkedList);
        Object[] array = linkedList.toArray();
        System.out.println("After conversion of LinkedList to array:");
        for (Object element: array){
            System.out.println(element + " ");
        }
    }
}
