//asList() method= converts an array into a list
//When asList() method is used with primitive arrays it shows the memory reference of the array instead of the list contents.
//It treats primitive data types (int[]) as array of objects not a list of values
package Arrays;
import java.util.Arrays; //Importing array utility class from java.util.package

public class AsListMethod {
    //main class
    public static void main(String[]args){
        //An Array
        int[] intArray = {10, 20, 25, 30, 35};
        //Convert elements in an array as a list
        System.out.println("Integer Array as a list: " + Arrays.asList(intArray));
    }
}
