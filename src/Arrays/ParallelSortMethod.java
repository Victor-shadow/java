package Arrays;
import java.util.Arrays;
//The method parallelSort() is used to sort an array in parallel
public class ParallelSortMethod {
    public static void main(String[]args){
        //Declare Array
        int[]initArray = {10, 20, 15, 22, 35};
        //Sort the array using ParallelSort
        Arrays.parallelSort(initArray);
        System.out.println("Integers Array " + Arrays.toString(initArray));

    }
}
