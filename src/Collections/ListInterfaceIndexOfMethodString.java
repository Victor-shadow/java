package Collections;
import java.util.*;
public class ListInterfaceIndexOfMethodString {
    public static void main(String[]args){
        //initialize a list of type LinkedList
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("Scala");

        System.out.println(list);
        System.out.println(list.indexOf("Kotlin"));

    }
}
