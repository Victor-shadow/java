package Collections;
import java.util.*;
public class CollectionsSynchronizedNavigableSetRemoveItem {
    public static void main(String[]args){
        NavigableSet<Integer> data = new TreeSet<>();
        //add elements into set
        data.add(2222);
        data.add(3333);
        data.add(4444);
        data.add(5555);
        data.add(6666);
        Set<Integer> finalset = Collections.synchronizedNavigableSet(data);
        //remove element
        finalset.remove(2222);
        //display
        System.out.println(finalset);

    }
}
