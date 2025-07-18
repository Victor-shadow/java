package Collections;

import java.util.*;

public class CollectionsEmptyListIteratorNoSuchElementException {
    public static void main(String[]args) {
        List<Integer> data = new ArrayList<Integer>();
        //add 2 elements in the list
        data.add(100);
        data.add(200);
        //iterate the elements
        ListIterator<String> iterator =Collections.emptyListIterator();
        //display
        System.out.println(iterator.next());


    }
}
