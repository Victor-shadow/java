package Collections;
import java.util.*;
public class SetInterface {
    public static void main(String[]args){
        //Create a Set using Hash Set
        Set<String> set = new HashSet<>();
        //display the set
        System.out.println("Set Elements: " + set);
    }
}
//HashSet will only appear as an Empty set, no elements were added
//The order of elements in HashSet  is not guaranteed, so the elements will be displayed in a random order if they are added