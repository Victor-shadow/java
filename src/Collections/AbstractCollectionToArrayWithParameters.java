//In Java, toArray(arr[]) method is used to convert an Abstract Collection into an array of a specified type
//It fills the provided array with the elements of the collection
//if the provided array is large enough it is used directly otherwise a new array of the appropriate size is created

//Syntax:
//Object[]toArray(T[]arr)

//Parameter: arr[] is the array into which the elements of the collection will be stored
//Return Type: The method returns an array containing the elements of the collection in the correct order

//Exception
//ArrayStoreException: If the array type is incompatible with the collection elements
//NullPointerException: If the provided array is null

package Collections;
import java.util.*;
public class AbstractCollectionToArrayWithParameters {
    public static void main(String[]args){
        //Empty Abstract Collection
        AbstractCollection<String> abs = new PriorityQueue<String>();
        //add elements to the collection
        abs.add("Java");
        abs.add("Kotlin");
        abs.add("Flask");
        //Display the Abstract Collection
        System.out.println("Abstract Collection: " + abs);
        //Create an Array and use toArray
        String[] arr = new String[3];
        arr =abs.toArray(arr);

        System.out.println("The Array is:");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + " ");

        }
    }

}
