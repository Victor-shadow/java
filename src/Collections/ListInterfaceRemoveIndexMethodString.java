package Collections;
import java.util.*;
public class ListInterfaceRemoveIndexMethodString {
    public static void main(String[]args){
        //Define an empty list of size 5
        List<String> list = new ArrayList<String>(5);
        //add elements to the list
        list.add("Java");
        list.add("Kotlin");
        list.add("C++");
        list.add("C#");
        list.add("Python");

        //index to remove the element
        int i = 2;
        //Initial list
        System.out.println("Initial list: " + list);
        //remove element
        list.remove(i);
        //final List
        System.out.println("Final list: " + list);

    }
}
