package Collections;
import java.util.*;
public class ListInterfaceHashCodeMethodLinkedList {
    public static void main(String[]args){
        //Initialize a list of type LinkedList
        List<String> list = new LinkedList<>();
        list.add("10");
        list.add("20");
        list.add("30");

        System.out.println(list);

        //implement hash Code method
        int l = list.hashCode();
        System.out.println("Hash Code of list: " + l);

    }
}
