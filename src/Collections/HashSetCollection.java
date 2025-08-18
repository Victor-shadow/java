package Collections;
import java.util.*;
public class HashSetCollection {
    public static void main(String[]args){
        //Instantiate a HashSet object
        HashSet<Integer> hashSet = new HashSet<>();
        //add elements
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        System.out.println("HashSet Size:" + hashSet.size());
        System.out.println("Elements in the HashSet: " + hashSet);

    }
}
