package Arrays;
import java.util.Arrays;
public class ModificationOfValuesInAFinalArray {
    public static void main(String[]args){
        final int[] numbers = {10, 20, 30, 40, 50};
        // Attempting to reassign the array reference will
        // result in a compilation error: numbers = new
        // int[] {6, 7, 8, 9, 10};
        numbers[0] = 1;
        System.out.println("Array after modification of the first element: " + Arrays.toString(numbers));
    }

}
