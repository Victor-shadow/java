package Collections;
import java.util.*;
public class TreeSetHigherMethodNullPointerException {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("10");
        treeSet.add("5");
        treeSet.add("8");
        treeSet.add("1");
        treeSet.add("11");
        treeSet.add("3");
        //pass a null value
        try {
            System.out.println(treeSet.higher(null));

        }
        //catch the exception
        catch (Exception e) {
            //print the Exception
            System.out.println(e);
        }
    }
}
