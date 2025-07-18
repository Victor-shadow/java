package Collections;
import java.util.*;

public class CollectionsCheckedListStringValues {
    public static void main(String[]argv) throws Exception{
        try{
            List<Integer> array = new ArrayList<Integer>();
            array.add(20);
            array.add(30);
            array.add(40);
            array.add(50);
            //Printing the elements of the above
            System.out.println("List: " + array);
            //Creating type safe view of the specified list with usage of checkedList() method
            List<Integer>typesafelist = Collections.checkedList(array, Integer.class);
            System.out.println("Typesafe view of the list: " + typesafelist);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown:" + e);
        }
    }

}
