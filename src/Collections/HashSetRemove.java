package Collections;
import java.util.*;
public class HashSetRemove {
    public static void main(String[]args){
        //Create a HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        //add elements into a HashSet
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        boolean b = hashSet.remove(2);
        System.out.println("Was 2 removed? " + b);

        boolean n =hashSet.remove(3);
        System.out.println("Was 3 removed? " + n);

    }
}
