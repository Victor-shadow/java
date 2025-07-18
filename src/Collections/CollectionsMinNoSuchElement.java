package Collections;
import java.util.*;

public class CollectionsMinNoSuchElement {
    public static void main(String[]argv) throws Exception{
        try{
            List<Integer> list = new LinkedList<>();
            //print list
            System.out.println("List: " + list);
            //Getting minimum value using min() method
            System.out.println("Trying to get" + " the minimum value" + " with empty list");
            //implement the min
            int min = Collections.min(list, Collections.reverseOrder());
            //Print min  value
            System.out.println("Min Value is: " + min);
        }
        catch (NoSuchElementException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
