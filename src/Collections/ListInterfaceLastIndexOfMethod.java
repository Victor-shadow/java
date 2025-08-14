/// This method returns the last index of the occurrence of the specified element in this list or -1
/// if this list does not contain the element
/// Syntax of Method: int lastIndexOf(Object object)
/// Parameters: This function takes a single parameter 'i.e' the element to be searched in the list
/// Return: This function returns the last index of the occurrence of the given element in the list and returns -1
/// if the element is not in the list
package Collections;
import java.util.*;
public class ListInterfaceLastIndexOfMethod {
    public static void main(String[]args){
        //Created List
        List<Integer> list = new ArrayList<>();
        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        //use of the lastIndex() method
        System.out.println(list);
        System.out.println("Index of 1: " + list.lastIndexOf(1));
    }
}
