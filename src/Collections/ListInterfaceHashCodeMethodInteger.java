package Collections;
import java.util.*;
public class ListInterfaceHashCodeMethodInteger {
    public static void main(String[]args){
      //initialize a list of type LinkedList
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        //implement hashCode() method
        int h = list.hashCode();
        System.out.println("HashCode of List: " + h);
    }
}
