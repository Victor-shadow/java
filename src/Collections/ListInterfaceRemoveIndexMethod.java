/// The remove(int index) method of List Interface in Java is used to remove an element from the specified index
/// from a List container and returns the element after removing it,
/// It also shifts the elements after the removed element by 1 position to the left in the List
/// Syntax of method: E remove(int index)
/// Where E is the type of element maintained by this List collection
/// Parameters: It accepts a single parameter index of integer type which represents the index of the element
/// needed to be removed from the List
/// Return value: It returns the element present at the given index after removing it
package Collections;
import java.util.*;
public class ListInterfaceRemoveIndexMethod {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(2);
        System.out.println("Final list: " + list);
    }

}
