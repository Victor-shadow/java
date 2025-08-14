///The contains() method of List Interface in Java is used for checking if the specified element
/// exists in the given list or not
/// Syntax of method: public boolean contains(Object obj)
/// Parameters: This method accepts a single parameter obj whose presence in the list is to be tested
/// Return value:It returns true if the specified element is found in the list else it returns false

package Collections;
import java.util.*;

class ListInterfaceContainsMethod {
    public static void main(String[]args){
        //create Empty Integer List
        List<Integer> list = new ArrayList<Integer>(4);
        //use add() to initialize values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //use contains() to check if the element exists
        boolean listContains = list.contains(10);

        if(listContains){
            System.out.println("The list contains 10");
        }
        else{
            System.out.println("The list does not contain 10");
        }
        //use contains() to check if the list contains 50
        listContains = list.contains(50);
        if (listContains)
            System.out.println("The list contains 50");
        else
            System.out.println("The list does not contain 50");

    }
}
