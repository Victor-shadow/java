//The reverseOrder() method of the collection class that in itself is present in the java.util.package returns a comparator
//and using this comparator we can order the Collection in reverse order
//Natural Ordering is the ordering imposed by objects own 'compareTo' method

//Syntax
//public static Comparator reverseOrder()
//parameter:
//A comparator whose ordering is to be reversed by the returned comparator(can be null)
//Return Type: A comparator that imposes the reverse of natural ordering on a collection of objects that implement ComparableInterface
package Collections;
import java.util.*;
public class CollectionsReverseOrder {
    public static void main(String[]args){
        //Create a list of Integers for which we create an empty array list by declaring object of ArrayList class
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        //custom input integer elements
        arraylist.add(100);
        arraylist.add(20);
        arraylist.add(300);
        arraylist.add(40);
        arraylist.add(50);

        //Using sort() method of collection class to sort the elements and pass the list using reverseOrder() method to sort in descending order
        Collections.sort(arraylist, Collections.reverseOrder());
        //printing the reversed array list
        System.out.println("List after the use of Collections.reverseOrder() method" + " Collections.sort() :\n" + arraylist);

    }

}
