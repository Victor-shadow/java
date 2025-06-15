package Arrays;
import java.util.Arrays;
//The method is used to compute the hash code for an array of objects recursively
public class DeepHashCodeMethod {
    public static void main(String[]args){
        //Array Initialization
        int[][]intArrays = {{10, 20, 15, 22, 35}};
        //To get the deep hash code of the arrays
        System.out.println("Integer Array: " + Arrays.deepHashCode(intArrays));
    }
}
