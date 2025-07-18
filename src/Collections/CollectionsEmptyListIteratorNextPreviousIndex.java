package Collections;
import java.util.*;
public class CollectionsEmptyListIteratorNextPreviousIndex {
    public static void main(String[]args){
        //Create an array List
        List<Integer> data = new ArrayList<Integer>();
        //add two elements into the empty array List
        data.add(100);
        data.add(200);
        //Iterate the elements
        ListIterator<String >iterator = Collections.emptyListIterator();
        System.out.println(iterator.nextIndex());
        //display previous element
        System.out.println(iterator.previousIndex());
    }

}
