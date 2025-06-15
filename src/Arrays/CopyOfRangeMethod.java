package Arrays;
import java.util.Arrays;
//The method is used to copy a range of elements from an array to a new array
public class CopyOfRangeMethod {
    public static void main(String[]args){
        //Array Initialization
        int[]intArray = {10, 20, 30, 40, 50};
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("\nNew Arrays by copyOfRange:\n");
        //Copy the array into an array of new length
        System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intArray, 1, 3)));


    }
}
