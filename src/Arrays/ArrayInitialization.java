package Arrays;
import java.util.stream.IntStream;

public class ArrayInitialization {
    public static void main(String[] args){
        //An Array of integers using IntStream.range() method
        int[]arr1 =IntStream.range(1, 5).toArray();
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[1] + " ");
        }
        System.out.print("\n");
        //An Array of Integers using IntStream.rangeClosed()
        int[]arr2=IntStream.rangeClosed(1, 4).toArray();
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[1] + " ");
        }
        System.out.print("\n");
        //An Array of Integers using IntStream.of() method
        int[]arr3=IntStream.of(1, 2, 3, 4).toArray();
        for(int i =0; i< arr3.length; i++){
            System.out.print(arr3[1] + " ");
        }
    }
}
