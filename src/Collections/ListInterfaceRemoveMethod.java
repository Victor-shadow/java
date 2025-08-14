/// The remove(Object o) method of the List Interface in Java is used to remove the first occurrence
/// of the specified element o from this List if it is present in the List
/// Syntax : boolean remove(Object obj)
/// Parameter: It accepts a single parameter obj of List type which represents the element to be removed
/// from the list
/// Return value:It returns a boolean value True after removing the first occurrence of the specified element
/// from the List and otherwise if the element is not present in the list then this method will return false
package Collections;
import java.util.*;
public class ListInterfaceRemoveMethod {
    public static void main(String[]args){
        //Declare an empty List of size 5
        List<Double> list = new ArrayList<Double>(5);
        //add elements to the list
        list.add(11.0);
        list.add(22.0);
        list.add(33.0);
        list.add(44.0);
        //element that needs to be removed
        double obj = 44.0;
        //Initial list
        System.out.println("Initial List: " + list);
        //remove element
        list.remove(obj);
        //final list
        System.out.println("Final list: " + list);

    }

}
