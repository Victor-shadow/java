/// The clear() method of List Interface in Java is used to remove all the elements from the List container
/// This method does not delete the list container, instead it just removes all the elements from the list
/// Syntax: public void clear()
/// Parameter: This method does not accept any parameter
/// Return Type: The Return type of the function is void and does not return anything
/// Exceptions: The Method throws UnsupportedOperationException if the clear() operation is not supported by this list
package Collections;
import java.util.*;
public class ListInterfaceClearMethod {
    public static void main(String[]args){
        //Create an Empty List with an Initial capacity
        List<String> list = new ArrayList<String>(5);
        //add() method to add elements to the list
        list.add("Java Virtual Machine");
        list.add("Native Machine Code");
        list.add("Common language Runtime");
        //original list
        System.out.println("Original List: " + list);
        //remove elements from the list
        list.clear();
        //print the list
        System.out.println("After Operation: " + list);

    }

}
