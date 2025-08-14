package Collections;
import java.util.*;
public class ListIteratorForwardAndBackwardIteration {
    public static void main(String[]args){
        //list of languages
        List<String> languages = new LinkedList<>();
        languages.add("Python");
        languages.add("C#");
        languages.add("C++");
        //List Iterator
        ListIterator<String> listIterator = languages.listIterator();
        //Traverse Elements
        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        //Traverse elements the iterator is at the end in this point
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
