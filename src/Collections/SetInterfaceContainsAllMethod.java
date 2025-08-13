package Collections;
import java.util.*;
public class SetInterfaceContainsAllMethod {
    public static void main(String[]args){
        //Create an empty set
        Set<String> set1 = new HashSet<String>();
        //add elements into set
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");

        System.out.println("Set 1: " + set1);
        //Create another empty set2
        Set<String> set2 = new HashSet<String>();
        set2.add("10");
        set2.add("20");
        set2.add("30");

        System.out.println("Set 2: " + set2);
        //check if set1 contains all elements of set 2
        System.out.println("Does set 1 contain all elements of set 2: " + set1.containsAll(set2));

    }
}
