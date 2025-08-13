package Collections;
import java.util.*;
public class SetInterfaceToArrayMethod {
    public static void main(String[]args){
        //Create a Set of Integers
        Set<Integer> set = new HashSet<Integer>();
        //add elements to the set
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(25);
        set.add(30);

        System.out.println("The set: " + set);
        //Convert the set to an integer array
        Integer[] arr =set.toArray(new Integer[0]);
        System.out.println("The Array is:");
        for (Integer num: arr){
            System.out.println(num);
        }



    }
}
