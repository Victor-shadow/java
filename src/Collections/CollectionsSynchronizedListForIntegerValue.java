package Collections;
import java.util.*;

public class CollectionsSynchronizedListForIntegerValue {
    public static void main(String[]argv) throws Exception{
        try {
            //Create Object of List
            List<Integer> mylist = new ArrayList<Integer>();
            mylist.add(20);
            mylist.add(30);
            mylist.add(40);
            mylist.add(50);
            mylist.add(60);
            //print the collection
            System.out.println("List: " + mylist);
            //Create a Synchronized List
            Collection<Integer> newlist = Collections.synchronizedList(mylist);
            //Print the Synchronized List
            System.out.println("Synchronized List is : " + newlist);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
