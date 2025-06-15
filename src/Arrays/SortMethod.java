package Arrays;
import  java.util.Arrays;
//The method sort() is used to sort an array in ascending order
public class SortMethod {
    public static void main(String[] args){
        //Declare array
        int[]initArray = {10, 20, 15, 22, 35};
        //Sort the Array
        Arrays.sort(initArray);
        System.out.println("Sorted Array: " + Arrays.toString(initArray));

    }
}
