package Collections;
import java.util.*;
//The checkedQueue method of Java Collections class is a method that returns a dynamically  and typesafe view
//of the given set
//Any attempt to insert an element of the wrong type will result in an immediate ClassCastException

//Syntax:
//public static <E> NavigableSet<E>
//checkedNavigableSet(NavigableSet<E> set, Class<E> datatype)

//Parameters
//set = is an input of set data
//datatype=is the type of elements the set can hold

//ReturnType: The method returns the dynamically and typesafe view of the given Set
//Exceptions:
//:ClassCastException = ClassCastException is a runtime exception raised in Java when we try to improperly cast
//from one class to another

public class CollectionsCheckedNavigableSet {
    public static void main(String[]args){
        //create a set of String type
        NavigableSet<String> data = new TreeSet<>();
        //Insert The values into the set

        data.add("Java");
        data.add("PHP/lisp");
        data.add("Python");
        data.add("R");

        //type safe view of the set
        System.out.println(Collections.checkedNavigableSet(data, String.class));
    }


}
