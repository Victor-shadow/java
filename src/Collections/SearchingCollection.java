package Collections;
import java.util.*;
//Collections.binarySearch() method returns the position of an object in a sorted list.
//The list should be sorted in ascending order, otherwise the result returned from the method will be wrong
//If the element exists in the list, the method will return the position of the element in the sorted list
//if the element does not exist in the list , the method will return a negative number that shows where the item should be inserted in the list


public class SearchingCollection {
    public static void main(String[]args){
        List<String> array = new ArrayList<>();
        //Adding elements to an object using add() method
        array.add("Shoes");
        array.add("Sneakers");
        array.add("Dress");
        array.add("Socks");
        array.add("Hat");
        //Sort the list
        Collections.sort(array);
        //Binary Search On the List
        System.out.println("The Index of Sneakers is: " + Collections.binarySearch(array, "Sneakers"));
        //Binary Search on The List
        System.out.println("The Index of Dress is: " + Collections.binarySearch(array, "Dress"));
    }

}
