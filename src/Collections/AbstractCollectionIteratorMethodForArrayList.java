package Collections;
import java.util.*;

public class AbstractCollectionIteratorMethodForArrayList {
    public static void main(String[]args){
        //Create an Empty Collection
        AbstractCollection<String> abs = new ArrayList<String >();
        //add elements into the collection
        abs.add("Java");
        abs.add("Flutter");
        abs.add("Kotlin");
        abs.add("Python");
        abs.add("C++");
        //Display the Collection
        System.out.println("Collection: " + abs);
        //Create an Iterator
        Iterator value = abs.iterator();
        //Display values
        System.out.println("The iterator values are: ");
        while (value.hasNext()){
            System.out.println(value.next());
        }


    }
}
