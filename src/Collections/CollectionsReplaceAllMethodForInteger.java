package Collections;
import java.util.*;

public class CollectionsReplaceAllMethodForInteger {
    public static void main(String[]argv) throws Exception{
        try{
            List<Integer> vector = new Vector<>();
            //populate the vector
            vector.add(1);
            vector.add(2);
            vector.add(3);
            vector.add(4);
            //print vector elements before replace
            System.out.println("Vector elements: " + vector);
            //Replace values
            Collections.replaceAll(vector, 1, 100);
            System.out.println("Value after replace: " + vector);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }
}
