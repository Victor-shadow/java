package Collections;
import java.util.*;
public class ListInterfaceContainsMethodString {
    public static void main(String[]args){
        //Create an Empty String list
        List<String> list = new ArrayList<String>(4);
        //use add() method to initialize values
        list.add("Java");
        list.add("Kotlin");
        list.add("C#");
        //use contains() method  to check if the element "C#" exists or not
        boolean ans = list.contains("Java");
        if (ans)
            System.out.println("The list contains Java");
        else
            System.out.println("The list does not contain Java");
        //use contains() to check if the element "C++" exists or not
        ans = list.contains("C++");

        if (ans)
            System.out.println("The list contains C++");
        else
            System.out.println("The list does not contain c++");

    }
}
