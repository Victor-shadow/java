package Collections;
import java.util.*;

public class CollectionsList {
    public static void main(String[]argv) throws Exception{
        try{
            List<Integer> data = new ArrayList<Integer>();
            //creating object of vector
            Vector<Integer> v = new Vector<Integer>();
            //adding element to vector v
            v.add(10);
            v.add(20);
            v.add(30);
            v.add(40);
            v.add(50);
            //print the list
            System.out.println("Current List: " + data);
            //Creation of Enumeration
            Enumeration<Integer> e = v.elements();

            data = Collections.list(e);
            System.out.println("Returned List: " + data);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
