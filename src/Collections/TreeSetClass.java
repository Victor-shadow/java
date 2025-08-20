package Collections;
import java.util.*;
public class TreeSetClass {
    public static void main(String[]args){
        //Create TreeSet and add elements
        TreeSet<String> tree = new TreeSet<>();
        tree.add("Java");
        tree.add("Kotlin");
        tree.add("Scala");
        tree.add("Python");
        tree.add("Rust");
        tree.add("Ruby");

        //Traverse elements
        Iterator<String> iterator = tree.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
