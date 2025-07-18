//java.util.Collections.sort() method is present in the java.util.Collections class
//It is used to sort th specified elements present in the list of Collection in ascending order

//syntax:
//public static void sort(List myList)
//myList: The  List type object we want to sort
//The method does not return anything
package Collections;
import java.util.*;
public class CollectionsSortMethod {
    public static void main(String[]args){
        //Create a list of Strings
        ArrayList<String> array = new ArrayList<String>();
        array.add("Germany");
        array.add("Brazil");
        array.add("Italy");
        array.add("Israel");
        array.add("France");
        //Collections.sort() method sorts the elements in the list in ascending order
        Collections.sort(array);
        System.out.println("List after the use of: " + " Collections.sort(): \n" + array);

    }

}
