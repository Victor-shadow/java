/// The get() method of the list interface in Java is used to get the element present in the list
/// at a given specific index
/// Syntax of method: E get(int index)
/// Where, E is the type of element maintained in the List container
/// Parameter: This method accepts a single parameter index of the type integer which represents the index
/// of the element in this list which is to be returned
/// Return value; It returns the element at the specified index in the given list
/// Exceptions/Errors: This method throws an IndexOutOfBoundsException if the index is out of range(index = size())

package Collections;
import java.util.*;
public class ListInterfaceGetMethod {
    public static void main(String[]args){
        //Create an Empty Integer List
        List<Integer> list = new ArrayList<Integer>(4);
        //add() method to initialize values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List: " + list);
        //element at index 2
        int element = list.get(2);
        System.out.println("The element at index 2 is: " + element);
    }

}
