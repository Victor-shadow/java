package Collections;
import java.util.*;

public class CollectionsMaxMethodNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try{
            List<Integer> list = new LinkedList<Integer>();
            //print the max() value method
            System.out.println("Trying to get: " + "max from the empty list");
            System.out.println("Max value is:" + Collections.max(list));
        }
        catch (ClassCastException e){
            System.out.println("Exception thrown: " + e);
        }
        catch (NoSuchElementException e){
            System.out.println("exception thrown: " + e);
        }

    }
}
