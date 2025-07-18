package Collections;
import java.util.*;

public class CollectionsReverseArrayElements {
    public static void main(String[]args){
        //Create an input integer array
        int[] array = {10, 20, 30, 40, 50, 60 ,70, 80, 90};
        //print elements of the array
        System.out.println("Original Array: " + Arrays.toString(array));
        //Reverse elements of the array using reverse() method of Collection class and fetching as list via List
        Collections.reverse(Arrays.asList(array));
        //print and display reversed array
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}
