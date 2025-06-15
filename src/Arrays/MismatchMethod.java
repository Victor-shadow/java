package Arrays;
import java.util.Arrays;
//The method is used to find the index of the first mismatched element between two arrays(Arrays.mismatch)
public class MismatchMethod {
    public static void main(String[]args){
        //Array Initialization
        int[]initArray = {10, 20, 15, 22, 35};
        //Second Array
        int[]secondArray = {10, 15, 22};

        //Compare both Arrays
        System.out.println("The element mismatched at index: " + Arrays.mismatch(initArray, secondArray));


    }
}
