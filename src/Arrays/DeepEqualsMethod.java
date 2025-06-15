package Arrays;
import java.util.Arrays;
//The method is used to compare two array of objects to check if they are deeply equal
public class DeepEqualsMethod {
    public static void main(String[]args){
        //Initialization of Arrays
        int[][]intArrays = {{10,20, 15, 22, 35}};
        //SecondArray
        int[][]secondArray = {{10, 15, 22}};
        //Compare both Arrays
        System.out.println("Integer Arrays on Comparison: " + Arrays.deepEquals(intArrays,secondArray));
    }
}
