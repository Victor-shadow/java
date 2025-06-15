//The binarySearch method searches for the specified element in the array
package Arrays;
import java.util.Arrays; //Import array utility class from the java.util package
public class BinarySearchMethod {
    public static void main(String[]args){
        //Array initialization
        int[]intArray = {10, 15, 20, 25, 30, 35, 40, 45, 50};
        //Sort the Array
        Arrays.sort(intArray);
        //Element of the array to be found
        int intKey = 50;
        //Print the key and the corresponding index
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArray, intKey));
    }
}
