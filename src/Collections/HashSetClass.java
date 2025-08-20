package Collections;
import java.util.*;
public class HashSetClass {
    public static void main(String[]args){
        //Create a HashSet and Add Elements
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Kotlin");
        hashSet.add("Scala");
        hashSet.add("Ruby");
        hashSet.add("Rust");
        hashSet.add("Python");

        //Traverse elements
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
