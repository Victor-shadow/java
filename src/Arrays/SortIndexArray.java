package Arrays;
import java.util.Arrays;
//The method is used to sort a specified range of an array in Ascending order
public class SortIndexArray {
    public static void main(String[] args){
        //Initialize Array
        int[]initArray = {10, 90, 30, 50, 20, 70};
        //Sort The array using Normal Index
        Arrays.sort(initArray, 1, 3);
        System.out.println("Integer Array: " + Arrays.toString(initArray));

    }
}
