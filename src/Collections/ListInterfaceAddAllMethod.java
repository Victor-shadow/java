/// The method appends all the elements in the specified collection to the end of this list
/// in the order they are returned by the specified collection iterator
/// Syntax: boolean addAll(Collection c)
/// Parameter: This function has a single parameter 'i.e' Collection c whose elements are to be appended to the list
/// It returns true if the elements of the specified list is appended and the list changes

package Collections;
import java.util.*;
public class ListInterfaceAddAllMethod {
    public static void main(String[]args){
        //Initialize a list of type Array List
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list);
        //Initialize a collection to be appended to the list
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        System.out.println(arrayList);

        list.addAll(arrayList);

        System.out.println(list);


    }
}
