/// The isEmpty() method of the List Interface in Java is used to check if a list is empty or not,
/// It returns true if the list contains no elements otherwise it returns false if the list
/// contains the elements
/// Syntax: boolean isEmpty()
/// Parameter: It does not accept a parameter
/// Return value: It returns True if the list has no elements else it returns false. The return type is of boolean value
/// Error and Exception: This method has no error or exception

package Collections;
import java.util.*;
public class ListInterfaceIsEmptyMethod {
    public static void main(String[]args){
        //Create Empty Array List
        List<Integer> list = new ArrayList<Integer>();
        //isEmpty() method
        System.out.println(list + " : ");
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);

        //demonstrate isEmpty Method
        System.out.println(list + " : ");
        System.out.println(list.isEmpty());

    }
}
