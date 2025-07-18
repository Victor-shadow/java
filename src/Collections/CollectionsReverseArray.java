package Collections;
import java.util.*;

public class CollectionsReverseArray {
    public static void main(String[]args){
        //Create an array
        Integer[] array = {100, 200, 300, 400, 500, 600};
        Arrays.sort(array, Collections.reverseOrder());

        //print the result
        System.out.println("Array after the use of Collections.reverseOrder()" + " and Arrays.sort() :\n" + Arrays.toString(array));
    }

}
