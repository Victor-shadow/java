package Arrays;
import java.util.Arrays;
//The method Arrays.spliterator() is used to create a Spliterator for a subrange of the given array starting from fromIndex(Inclusive) to toIndex(exclusive)
public class Spliterator {
    public static void main(String[]args){
        //Initialize the array
        int[]intArray = {90, 80, 70, 10, 20, 30};
        //Sort the array using normal sort
        System.out.println("Integer Array: " + Arrays.spliterator(intArray, 1, 5));

    }
}
