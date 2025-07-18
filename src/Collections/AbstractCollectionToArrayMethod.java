//In Java, the toArray() method is part of the AbstractCollection class
//It is used to convert collections like a list, Set into an Array
//It copies all the elements from the collection into the new array
package Collections;
import java.util.*;

public class AbstractCollectionToArrayMethod {
    public static void main(String[]args){
        //empty Abstract Collection
        AbstractCollection<String > abs = new PriorityQueue<String>();
        //Add elements
        abs.add("Java");
        abs.add("C++");
        abs.add("C");
        abs.add("JS");

        //Display the Abstract Collection
        System.out.println("The Abstract Collection: " + abs);
        //Create an array and use toArray Method
        Object[] arr = abs.toArray();
        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + " ");
        }

    }

}
