//shuffle() method of Collection class  is present in the java.util package that shuffle elements in the list

//Shuffle a list using pre-defined source of randomness
//syntax:
//public static void shuffle(List myList)
//Exception thrown =  UnsupportedOperationException if the given list or list-iterator does not support the set operation

package Collections;
import java.util.*;
public class CollectionsShuffleMethod {
    public static void main(String[]args){
        //Create an Empty array List of String type
        ArrayList<String> array = new ArrayList<String>();
        array.add("java");
        array.add("html");
        array.add("css");
        array.add("kotlin");
        array.add("cpp");
        array.add("python");
        array.add("javascript");
        //print list before shuffle
        System.out.println("Original List: \n" + array);
        //Shuffle the list
        Collections.shuffle(array);
        //print list after Shuffle
        System.out.println("\nShuffled List: \n" + array);
    }
}

//This method randomly permutes elements randomly in a list
//It runs in linear time
//Access to elements
//=It traverses the list elements backwards, from the last element to the second, repeatedly swapping a randomly selected element to its current position
//Thereafter the elements are randomly selected from the portion of the list that runs from the first element to the current position inclusive

//If the provided list does not implement RandomAccessInterface, like LinkedList and is large it first copies the list into an array,
//then shuffles the array copy  and finally copies the array back into the list. This makes sure that the time remains linear
