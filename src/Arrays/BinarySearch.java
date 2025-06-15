//The method binarySearch() searches the range of the specified array for the specified object using the binarySearchAlgorithm
package Arrays;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[]args){
        //Get the Array
        int[]intArray = {10, 15, 20, 25, 30, 35, 40,45, 50, 55};
        //Sort the array
        Arrays.sort(intArray);
        int intKey = 55;
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArray, 1, 3, intKey));
    }

}
