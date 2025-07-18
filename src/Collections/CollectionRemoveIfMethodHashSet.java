package Collections;

import java.util.HashSet;
import java.util.function.Predicate;

public class CollectionRemoveIfMethodHashSet {
    public static void main(String[]args){
        HashSet<Integer> hashset = new HashSet<Integer>();
        hashset.add(100);
        hashset.add(200);
        hashset.add(300);
        hashset.add(401);
        hashset.add(501);
        hashset.add(601);
        //Print the original hash set
        System.out.println("Original HashSet: " + hashset);
        Predicate<Integer> even = n-> n % 2 == 0;
        //removes elements which are odd
        hashset.removeIf(even);
        //Processed array list
        System.out.println("List after removeIf() method: " + hashset);
    }
}
