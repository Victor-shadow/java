package Collections;
import java.util.*;

public class CollectionsEmptyListException {
    public static void main(String[]args){
        //Creating an empty list
        List<Integer> myList = Collections.<Integer>emptyList();

        //add 5 elements to the empty list
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        //Display the list
        System.out.println(myList);

    }
}
