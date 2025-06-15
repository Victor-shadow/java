//The method is used to copy the elements of an array into a new array of the specified length
package Arrays;
import java.util.Arrays;

public class CopyOfMethod {
    public static void main(String[]args){
        //Array Initialization
        int[]intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //Print elements in one line
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("\nNew Arrays by copyOf:\n");
        System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArray, 10)));

    }
}
