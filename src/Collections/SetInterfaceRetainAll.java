package Collections;
import java.util.*;
public class SetInterfaceRetainAll {
    public static void main(String[]args){
        //Create two sets of Integers
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2  = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        System.out.println("set 1 is: " + set1);
        System.out.println("set 2 is: " + set2);
        //call retainAll method to check returned value
        boolean b = set1.retainAll(set2);
        System.out.println("Set1 after retainAll(common elements): " + set1);
        System.out.println("Was the set modified? " + b);
        //Modify set1 to contain all elements of set2
        set1 = new HashSet<>(Arrays.asList(3, 4, 5));
        //Now retain elements common in set1 and set2
        b = set1.retainAll(set2);
        System.out.println("Set 1 after removeAll(common elements): " +set1);
        System.out.println("Was the set modified? " + b);


    }
}
