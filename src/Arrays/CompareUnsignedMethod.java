package Arrays;
//The method compareUnsigned is used to compare two arrays of primitive data type int[] or other primitive array types lexicographically but with values treated as unsigned integers
import java.util.Arrays;

public class CompareUnsignedMethod {
    public static void main(String[]args){
        //First Array
        int[]intArray = {10, 15, 22, 35, 40};
        //Second Array
        int[]secondArray = {10, 15, 22};
        //Compare the results
        System.out.println("Integer arrays on Comparison: " + Arrays.compareUnsigned(intArray, secondArray));

    }
}
