package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//The checkedList() method of Collection class  is present inside java.util package is used to dynamically
//typesafe view of the specified list
//The returned list will be serializable if the specified list is serializable. Since null is considered to be a value of any reference type,
//the returned list permits the insertion of null elements whenever the backing list does

//Syntax:
//public static List checkedList(List list, Class type);
//Parameters:
//This method takes the following arguments as parameters:
//the list for which a dynamically typesafe view is to be returned
//The type of element the list is permitted to hold
//Return Type:
//A dynamically typesafe view of the specified list
//This method throws a ClassCastException
public class CollectionsCheckedList {
    public static void main(String[]argv) throws Exception{
        try {
            List<String> arraylist = new ArrayList<String>();
            arraylist.add("a");
            arraylist.add("b");
            arraylist.add("c");
            arraylist.add("checked list");

            System.out.println("List: " + arraylist);
            List<String> array = Collections.checkedList(arraylist, String.class);
            System.out.println("Typesafe view of the list: " + array);
        }
        catch (IllegalArgumentException e){
            System.out.println("Exception thrown: " + e);
        }

    }
}
