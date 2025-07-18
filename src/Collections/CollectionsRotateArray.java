package Collections;

import java.util.*;

public class CollectionsRotateArray {
    public static void main(String[]args){
        //Array of Integers
        Integer[]arr = {10, 20, 30, 40 ,50};
        System.out.println("Original Array: " + Arrays.toString(arr));
        //rotate an array by distance 2
        Collections.rotate(Arrays.asList(arr), 2);
        System.out.println("Modified Array: " + Arrays.toString(arr));

    }
}
