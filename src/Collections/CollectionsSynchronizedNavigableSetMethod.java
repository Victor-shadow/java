package Collections;
import java.util.*;


public class CollectionsSynchronizedNavigableSetMethod {
    public static void main(String[]args){
        //create a navigable tree set
        NavigableSet<Integer> data = new TreeSet<Integer>();
        //add elements in the set
        data.add(1000);
        data.add(2000);
        data.add(3000);
        data.add(4000);
        //get the synchronized Navigable set
        Set<Integer> finalset = Collections.synchronizedNavigableSet(data);
        //display
        System.out.println(finalset);

    }

}
