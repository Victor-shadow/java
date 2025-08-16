package Collections;
import java.util.*;
public class TreeSetPollLastMethodInteger {
    public static void main(String[]args){
        //Create a Set Object
        TreeSet<Integer> set = new TreeSet<Integer>();
        //print the set content
        System.out.println("The Contents of the set: " + set);
        //retrieve and remove the last element of the set
        System.out.println("The last element of the set: " + set.pollLast());
    }
}
