package Arrays;
import java.util.Arrays;
//The method is used to compare two arrays to check if they are equal
public class EqualsMethod {
    public static void main(String[]args){
        //Array Initialization
        int[][]intArray = {{10, 20, 15, 22, 35}};
        //Second Array
        int[][] secondArray = {{10, 15, 22}};
        System.out.println("Integer Arrays on comparison: " + Arrays.equals(intArray, secondArray));

    }
}
