package Collections;

import java.util.*;

public class CollectionsCheckedSetForInteger {
    public static void main(String[]argv) throws Exception{
        try{
            //Creating object of set
            Set<Integer> hset = new TreeSet<>();
            //Adding elements to hset
            hset.add(10);
            hset.add(20);
            hset.add(30);
            //Print the set
            System.out.println("Set: " + hset);
            //create typesafe view of the specified set
            Set<Integer>  typesafeset= Collections.checkedSet(hset, Integer.class);

            System.out.println("Typesafe view of the set: " + typesafeset);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
