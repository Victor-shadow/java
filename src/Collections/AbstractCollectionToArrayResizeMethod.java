package Collections;
import java.util.*;


public class AbstractCollectionToArrayResizeMethod {
    public static void main(String[]args){
        AbstractCollection<String> a = new PriorityQueue<String>();
        //Add elements into the abstract collection
        a.add("Argent");
        a.add("Hydrangea");
        a.add("Oleum");
        a.add("Aurum");

        //Display Abstract Collection
        System.out.println("Abstract Collection: " + a);
        //Create an array smaller than the size of the Abstract Collection
        String[]arr = new String[6];
        arr = a.toArray(arr);
        System.out.println("The Array is: ");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + " ");
        }



    }
}
