/// The size() method of the List Interface in Java is used to get the number of elements in the list
/// That is, the list size() method returns the count of elements present in this list container
/// Syntax: public int size()
/// Parameters: This method does not take any parameters
/// This method returns the number of elements in the list
///
/// ArrayList ->(implements) List Interface -> (extends) Collection


package Collections;
import java.util.*;
public class ListInterfaceSizeMethod {
    public static void main(String[]args){
        //Create ArrayList object
        List<Integer> list = new ArrayList<Integer>();
        //add elements
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        //use size() method to get total size of the list
        int s = list.size();
        System.out.println("Size: " + s);


    }
}
