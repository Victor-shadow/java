package Collections;
import java.util.*;


public class CollectionsMinMethodNoSuchElementException {
    public static void main(String[]argv) throws Exception{
        try{
            //Create link list Object
            List<Integer> list = new LinkedList<Integer>();
            //Print the List
            System.out.println("List: " + list);
            //Getting minimum value using min() method
            System.out.println("Trying to get" + " the minimum value " + "with empty list");
            int min = Collections.min(list);
            //Printing the min value
            System.out.println("Min Value is: " + min);
        }
        catch (NoSuchElementException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
