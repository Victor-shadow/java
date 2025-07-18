package Collections;
import java.util.*;

public class CollectionsIndexOfSublistMethodForInteger {
    public static void main(String[] argv) throws Exception{
        try{
            List<Integer> arrayInteger = new ArrayList<Integer>();
            List<Integer> arrayListTarget = new ArrayList<Integer>();
            //Adding elements to arrayInteger
            arrayInteger.add(100);
            arrayInteger.add(200);
            arrayInteger.add(300);
            arrayInteger.add(400);
            arrayInteger.add(500);
            //Adding Elements to arrayListTarget
            arrayListTarget.add(10);
            arrayListTarget.add(20);
            //print source list
            System.out.println("Source List: " + arrayInteger);
            //PRINT TARGET LIST
            System.out.println("Target List: " + arrayListTarget);
            //check target list
            int index = Collections.indexOfSubList(arrayInteger, arrayListTarget);
            //print index
            System.out.println("Found index: " + index);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
