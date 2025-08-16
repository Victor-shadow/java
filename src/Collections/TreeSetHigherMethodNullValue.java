package Collections;
import java.util.*;
public class TreeSetHigherMethodNullValue {
    public static void main(String[]args){
         //Create an Empty TreeSet
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(3);

        System.out.println(treeSet.higher(15));
    }
}
