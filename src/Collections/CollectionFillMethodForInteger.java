package Collections;
import java.util.*;


public class CollectionFillMethodForInteger {
    public static void main(String[]argv) throws Exception{
        //Create object of List
        List<Integer> obj = new ArrayList<Integer>();
        //Add elements
        obj.add(20);
        obj.add(30);
        obj.add(40);
        //Print the elements
        System.out.println("List element before fill: " + obj);
        //fill the list
        Collections.fill(obj, 100);
        System.out.println("List element after fill: " + obj);
    }

}
