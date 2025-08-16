package Collections;
import java.util.*;
public class TreeSetLowerMethodClassCastException {
    public static void main(String[]args){
        TreeSet<List> treeSet = new TreeSet<List>();
        List<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        treeSet.add(list);

        List<Integer> list1 = new LinkedList<Integer>();
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(5);
        list2.add(6);

        try {
            System.out.println(treeSet.lower(list2));
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
