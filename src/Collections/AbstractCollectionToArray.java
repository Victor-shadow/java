//toArray() method  copies the elements from the collection into a new array
//Syntax:
//Object[] arr = AbstractCollection.toArray()
//parameter: the method does not take any parameter
//Return Type: This method returns an array containing the elements of the Abstract Collection

package Collections;
import java.util.*;
public class AbstractCollectionToArray {
    public static void main(String[]args){
        //Empty Abstract Collection
        AbstractCollection<Integer> abs = new PriorityQueue<Integer>();
        //Add elements
        abs.add(100);
        abs.add(200);
        abs.add(300);
        abs.add(400);
        abs.add(500);
        //Display the AbstractCollection
        System.out.println("The Abstract Collection is: " +abs);
        //Create the array And use toArray() method
        Object[] arr = abs.toArray();

        System.out.println("The array is: ");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + " ");
        }

    }
}
