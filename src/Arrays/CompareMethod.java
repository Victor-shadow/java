package Arrays;
import java.util.Arrays;
//The method returns the difference as an integer lexicographically
public class CompareMethod {
    public static void main(String[]args){
        //Array Initialization
        int[]intArray = {10, 20, 15, 22, 35};
        //Second Array
        int[]secondArray = {10, 15, 22};
        //Compare Both Arrays
        System.out.println("Integer arrays on comparison: " + Arrays.compare(intArray, secondArray));
    }
}
