package Collections;
import java.util.*;
class LinkedListClass {
    public static void main(String[]args){
        //Declare the LinkedList
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        //append new elements at the end of the list
        for (int i = 1; i <=5; i++)
            linkedList.add(i);

        //print elements
        System.out.println(linkedList);
        //remove elements at index 3
        linkedList.remove(3);
        //display the list after delete
        System.out.println(linkedList);

        for (int i = 0; i < linkedList.size(); i++)
            System.out.println(linkedList.get(i) + " ");
    }
}
