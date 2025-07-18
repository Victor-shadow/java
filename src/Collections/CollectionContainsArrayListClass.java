package Collections;
import java.util.*;

public class CollectionContainsArrayListClass {
    public static void main(String[]args){
        //Create an empty ArrayList with an initial capacity
        Collection<Integer> arraylist = new ArrayList<Integer>(5);
        //Use add method
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);

        //Output the present list
        System.out.println("ArrayList: " + arraylist);
        //Check the presence of 12 in the array list
        boolean result = arraylist.contains(12);
        //print the result
        System.out.println("Is 12 present in the array list: " + result);
    }

}
