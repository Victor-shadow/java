package Collections;
import java.util.*;
public class SetInterfaceRemoveAllMethod {
    public static void main(String[]args){
        Set<String> set = new HashSet<>();
        set.add("January");
        set.add("February");
        set.add("March");

        Set<String> set1 = new HashSet<>();
        set1.add("February");
        set1.add("March");

        //remove elements that exist in set1 from set
        boolean res = set.removeAll(set1);
        System.out.println("Set1 after removing set2 elements from it: " + set);
        System.out.println("Was the collection modified? " + res);


    }
}
