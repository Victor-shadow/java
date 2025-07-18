//The java.util.Collections.Singleton() method is a java.util.Collections class method
//It creates an immutable set over a single specified element

//Syntax: public static Set singleton(T object)
//public static List singletonList(T object)
//parameters: obj = the sole object to be stored in the returned list or set
//Returns an immutable list/set containing only the specified object
package Collections;
import java.util.*;
public class CollectionsSingletonMethod {
    public static void main(String[]args){
        String[] numberList = {"1", "2", "4", "2", "1", "2", "3", "1", "3", "4", "3", "3"};
        //Create a list and remove an element without use of Singleton()
        List numberLis1 = new ArrayList(Arrays.asList(numberList));
        System.out.println("Original NumberList: " + numberLis1);
        numberLis1.remove("1");
        System.out.println("NumberList1 after removal of 1 without: " + " singleton " + numberLis1);
        numberLis1.remove("1");
        System.out.println("NumberList1 after removal of 1 without: " + " singleton " + numberLis1);
        numberLis1.remove("2");
        System.out.println("NumberList1 after removal of 2 without: " + " singleton " + numberLis1);
        //Creating another list and removing its elements using Singleton() method
        List numberList2 = new ArrayList(Arrays.asList(numberList));
        System.out.println("\nOriginal List2: " + numberList2);
        //Selectively delete 1 from all its occurrences
        numberList2.removeAll(Collections.singleton("1"));
        System.out.println("NumberList2 after removal of 1 with: " + " singleton " + numberList2);
        //Selectively delete 4 from all its occurrences
        numberList2.removeAll(Collections.singleton("4"));
        System.out.println("NumberList2 after removal of 4 with: " + " singleton " + numberList2);
        //Selectively delete 3 from all its occurrences
        numberList2.removeAll(Collections.singleton("3"));
        System.out.println("NumberList after removal of 3 with: " + " singleton " + numberList2);


    }
}
