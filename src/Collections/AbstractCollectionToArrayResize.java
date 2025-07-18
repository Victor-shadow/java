package Collections;
import java.util.*;
public class AbstractCollectionToArrayResize {
    public static void main(String[]args){
        AbstractCollection<String > abs = new PriorityQueue<String>();
        //Add Elements to the Abstract Collection
        abs.add("January");
        abs.add("February");
        abs.add("March");
        abs.add("April");

        //Display Abstract Collection
        System.out.println("Abstract Collection: " + abs);
        //Create an array smaller than the size of Abstract Collection
        String[] arr = new String[2];
        arr = abs.toArray(arr);

        System.out.println("The Array is: ");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + " ");
        }

    }
}
