package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsLastIndexOfSubListMethod {
    public static void main(String[]args){
        //create first list with numbers
        List<Integer> array = Arrays.asList(1, 2, 3, 45, 67, 54, 45);
        //Create last list with numbers
        List<Integer> lst = Arrays.asList(5, 7, 8, 6, 67);
        //Check source list in last list
        System.out.println("Source List: " + Collections.lastIndexOfSubList(array, lst));
    }
}
