//min(Collection<? extends T> coll, Comparator<? super T> comp)
//The min(Collections, Comparator) method of java.util.Collections class is used to return the minimum collection element
//according to the order specified by the comparator
//All elements in the collection, must be mutually comparable by the specified comparator
//This method iterates all the elements in the collection, hence it requires time proportional to the size of the collection
//Parameters: This method takes the following parameter as an argument
//col - the collection whose minimum element is to be determined
//comp - the Comparator with which to determine the minimum element.A null value indicates that the elements
//natural ordering is used
package Collections;
import java.util.*;
public class CollectionsMinMethodNoSuchElement {
    public static void main(String[]argv) throws Exception{
        try{
            List<Integer> arrlist = new LinkedList<Integer>();
            //Populate the list
            arrlist.add(10);
            arrlist.add(20);
            arrlist.add(30);
            arrlist.add(40);
            arrlist.add(50);
            //print list
            System.out.println("List:" + arrlist);
            //get minimum value()
            int min = Collections.min(arrlist, Collections.reverseOrder());
            //print min value
            System.out.println("Main value by reverse order: " + min);
        }
        catch (NoSuchElementException e){
            System.out.println("Exception thrown: " + e);
        }
    }

}
