//The iterator() method of java AbstractCollection class is used to return an iterator of the same elements as that of the collection
//The elements are Returned in Random order  from what was present in the Collection

//Syntax:
//Iterator iterator_value = AbstractCollection.iterator();
//Parameter: The function does not take any parameters
//Return value: The method iterates over the elements of the Collection and returns the values(Iterators)

package Collections;
import java.util.*;
import java.util.AbstractCollection;
public class AbstractCollectionIteratorMethod {
    public static void main(String[]args){
        //Create an Empty Collection
        AbstractCollection<String> abs = new TreeSet<String >();
        //Use add() method to add elements into the collection
        abs.add("January");
        abs.add("February");
        abs.add("March");
        abs.add("April");
        abs.add("May");

        //Display the Collection
        System.out.println("Collection" + abs);
        //Create an Iterator
        Iterator value = abs.iterator();
        //Display the values after iteration of the elements in the collection
        System.out.println("The iterator values are:");
        while (value.hasNext()){
            System.out.println(value.next());
        }
    }

}
