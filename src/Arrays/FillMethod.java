package Arrays;
import java.util.Arrays;
//The method is used to fill an entire array or a subrange of array with a specific value
public class FillMethod {
    public static void main(String[]args){
        //Array Initialization
        int[]initArray = {10, 20, 15, 22, 35};
        int intKey = 35;

        Arrays.fill(initArray, intKey);
        //To fill Arrays
        System.out.println("Integer Arrays on Filling: " + Arrays.toString(initArray));
    }
}
