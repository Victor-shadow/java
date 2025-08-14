/// This method returns the index of the first occurrence of the specified element in this list or -1
/// if the list does not contain the element
/// Syntax of Method: public int indexOf(Object o)
/// Parameter: This function takes a single parameter 'i.e' the element to be searched in the list
/// Return value:The method returns the index of the first occurrence of the given element and returns "-1" if the element is not
/// in the list


package Collections;
import java.util.*;
public class ListInterfaceIndexOfMethod {
    public static void main(String[]args){
        //Initialize a list of type LinkedList
        List<Integer> list = new LinkedList<>();
        //add elements to the list
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);

        System.out.println(list);

        //index of method
        System.out.println(list.indexOf(5));

    }
}
