package Collections;
import java.util.*;
public class TreeSetLowerMethod {
    public static void main(String[]args){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println(treeSet.lower(15));
    }
}
