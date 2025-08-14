package Collections;
import java.util.*;
public class ListInterface {
    public static void main(String[]args){
        //Create a List of Strings using ArrayList
        List<String> list = new ArrayList<>();
        //add elements into the list
        list.add("Java");
        list.add("C#");
        list.add("C++");
        list.add("Python");

        System.out.println("The elements of the list are: ");

        //Iterate through the list
        for (String s: list){
            System.out.println(s);
        }
        //access elements
        System.out.println("Element at index 1: " + list.get(1));
        //update elements
        list.set(1, "Javascript");
        System.out.println("Updated List: " + list);
        //remove elements
        list.remove("C++");
        System.out.println("List after removing elements: " + list);

    }
}
