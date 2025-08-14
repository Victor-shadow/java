package Collections;
import java.util.*;
public class ListInterfaceRemove {
    public static void main(String[]args){
        //Declare an empty list of size 5
        List<String> list = new ArrayList<String>(5);
        list.add("Java");
        list.add("Kotlin");
        list.add("Python");
        list.add("Scala");
        list.add("Javascript");

        //Element to be removed
        String obj = "Java";
        //Initialize the list
        System.out.println("Initial list: " + list);
        //remove element
        list.remove(obj);
        //final list
        System.out.println("Final List: " + list);


    }
}
