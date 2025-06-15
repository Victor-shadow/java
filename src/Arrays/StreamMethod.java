package Arrays;
import java.util.Arrays;
//The method Arrays.stream() is used to convert an array into a stream
public class StreamMethod {
    public static void main(String[]args){
        //Create the array
        int[]intArray = {10, 20, 30, 40, 50, 60, 70, 80};
        //To get the stream from the array
        System.out.println("Integer Array: " + Arrays.stream(intArray));

    }
}
