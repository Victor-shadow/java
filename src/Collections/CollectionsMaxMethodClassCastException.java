package Collections;
import java.util.*;

public class CollectionsMaxMethodClassCastException {
    public static void main(String[]argv) throws Exception{
        try{
         List<String> list = new LinkedList<String>();
         //create variable of object type
            Object i = Integer.valueOf(42);
            //Adding elements
            list.add("Java");
            list.add((String)i);
        //print max() method
            System.out.println("Max method: " + Collections.max(list));
        }
        catch (ClassCastException e){
            System.out.println("Exception thrown: " + e);
        }
        catch (NoSuchElementException e){
            System.out.println("Exception thrown: " + e);
        }

    }


}
