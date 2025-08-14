package Collections;
import java.util.*;
public class ListIteratorInterface {
    //Main Driver Method
    public static void main(String[]args){
        //Create a list of names
        List<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Kotlin");
        list.add("Python");
        //List Iterator
        ListIterator<String> listIterator = list.listIterator();
        //traverse elements using next() method
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //for each loop creates an internal Iterator
        for (String s: list){
            System.out.println(s);

        }

    }
}
