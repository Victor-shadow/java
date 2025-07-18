package Collections;
import java.util.*;

public class CollectionsSynchronizedCollectionForInteger {
    public static void main(String[]argv) throws Exception{
        try{
            //Create object of List
            List<Integer> vector = new ArrayList<Integer>();
            //populate the vector
            vector.add(20);
            vector.add(30);
            vector.add(40);
            vector.add(50);
            vector.add(60);
            //print the collection
            System.out.println("Collection: " + vector);
            //get synchronizedView of collection
            Collection<Integer> c = Collections.synchronizedCollection(vector);
            //print the collection
            System.out.println("Synchronized view is: " + c);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
