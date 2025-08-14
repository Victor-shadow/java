/// The set() method of the ArrayList class in Java is used to replace an element at the specified position
/// with a new value
/// Syntax: public E set (int index,E element)
/// Parameters: index: Index of the element to replace
///  an element to be stored at the specified position
/// Return value:It returns the element that was previously at the specified position
/// Exception: IndexOutOfBoundsException Thrown if the index is out of bounds/range (index < 0 or index >= size)

package Collections;
import java.util.*;
public class ListInterfaceSetMethod {
    public static void main(String[]args){
        //Create an ArrayList and add elements
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //print the original ArrayList
        System.out.println("ArrayList: " + arrayList);
        //replace the element at index 3 with 9
        int replace = arrayList.set(3, 9);

        System.out.println("New ArrayList: " + arrayList);
        System.out.println("Replaced element: " + replace);

    }
}
