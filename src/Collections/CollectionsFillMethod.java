package Collections;
import java.util.*;

//the fill method() of java.Util.Collections class is used to replace all  the elements of the specified list with the specified element
//The method runs on linear time
//Syntax: public static void fill(List, list, T obj);
//Parameters:
//list = The list to be filled with the specified element
//object = the element with which to fill the specified list
public class CollectionsFillMethod {
    public static void main(String[]argv) throws Exception{
        //Creating Object of list
        List<String> object = new ArrayList<String >();
        //add elements
        object.add("A");
        object.add("B");
        object.add("C");
        object.add("D");

        //print the elements
        System.out.println("List elements before fill: " + object);
        //fill the list
        Collections.fill(object, "An Array");
        //print the elements
        System.out.println("\nlist elements after fill: " + object);


    }


}
