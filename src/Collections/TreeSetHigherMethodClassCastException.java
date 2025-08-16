package Collections;
import java.util.*;
public class TreeSetHigherMethodClassCastException {
    public static void main(String[]args){
       TreeSet<List> tree = new TreeSet<List>();
       List<Integer> list = new LinkedList<Integer>();
       try {
           list.add(1);
           list.add(2);
           System.out.println(tree.add(list));

           List<Integer> list1 = new LinkedList<Integer>();
           list1.add(3);
           list1.add(4);

           List<Integer> list2 = new LinkedList<Integer>();
           list2.add(5);
           list2.add(6);

       }
       catch (Exception e){
           System.out.println(e);
       }
    }
}
