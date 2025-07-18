package Collections;
import java.util.*;

public class CollectionsSynchronizedSetForIntegerValue {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of set
            Set<Integer> set = new HashSet<Integer>();
            //populate the set
            set.add(100);
            set.add(200);
            set.add(300);
            set.add(400);
            set.add(500);
            //print the set
            System.out.println("Set: " + set);
            //create a SynchronizedSet
            Set<Integer> syncset = Collections.synchronizedSet(set);
            //print the set
            System.out.println("Synchronized set: " + syncset);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
