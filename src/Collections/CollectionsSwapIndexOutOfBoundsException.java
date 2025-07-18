package Collections;
import java.util.*;

public class CollectionsSwapIndexOutOfBoundsException {
    public static void main(String[]argv) throws Exception{
        try{
            //Create List Object
            List<String> vector = new ArrayList<String>();
            //populate the vector
            vector.add("A");
            vector.add("B");
            vector.add("C");
            vector.add("D");
            vector.add("E");
            //print vector before swap
            System.out.println("Vector before Swap: " + vector);
            //Swap the elements
            System.out.println("\n Trying to swap the elements" + " more  than upper bound index" );
            Collections.swap(vector,0, 5);
            //Print vector after swap
            System.out.println("Vector after swap: " + vector);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
