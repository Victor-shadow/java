package Collections;
import java.util.*;

public class AbstractCollectionToArrayNullPointerException {
    public static void main(String[]args){
        //Abstract Collection
        AbstractCollection<String> abs = new PriorityQueue<String >();
        //use add() method to add elements into the AbstractCollection
        abs.add("January");
        abs.add("February");
        abs.add("March");
        //Display the Abstract Collection
        System.out.println("Abstract Collection: " + abs);
        try {
            //Create the array
            String[] arr = null;
            arr = abs.toArray(arr);
            System.out.println("The arr[] is: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
        catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }