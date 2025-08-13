package Collections;
import java.util.*;
public class SetInterfaceRetainAllNullPointerException {
    public static void main(String[]args){
        //Create a set with null values
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, null));
        Set<Integer> set2 = null;

        set.retainAll(set2);

    }
}
