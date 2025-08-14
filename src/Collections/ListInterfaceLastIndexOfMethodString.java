package Collections;
import java.util.*;
public class ListInterfaceLastIndexOfMethodString {
    public static void main(String[]args){
        //Initialize a list of type LinkedList
        List<String> list = new LinkedList<>();
        list.add("10");
        list.add("30");
        list.add("50");
        list.add("70");
        list.add("30");

        System.out.println(list);
        System.out.println("Index of 30: "+ list.lastIndexOf("30"));

    }
}
