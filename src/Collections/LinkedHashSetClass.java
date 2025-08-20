package Collections;
import java.util.*;
public class LinkedHashSetClass {
    public static void main(String[]args){
        //Create a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Java");
        linkedHashSet.add("Kotlin");
        linkedHashSet.add("Scala");
        linkedHashSet.add("Python");
        linkedHashSet.add("Rust");
        linkedHashSet.add("Ruby");

        //Traverse elements
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
