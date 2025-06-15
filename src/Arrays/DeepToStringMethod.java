package Arrays;
import java.util.Arrays;
//the method is used to return a string representation of an array recursively
public class DeepToStringMethod {
    public static void main(String[]args){
        //Array Initialization
        int[][]intArray = {{10, 20, 15, 22, 35}};
        //To get the deep string of the array
        System.out.println("Deep To String: " + Arrays.deepToString(intArray));


    }
}
