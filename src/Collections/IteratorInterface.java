package Collections;
import java.util.*;
public class IteratorInterface {
    public static void main(String[]args){
        //Create a Vector Object
        Vector vector = new Vector<>();
        //Initialize Iterators
        Enumeration enumeration = vector.elements();
        Iterator iterator = vector.iterator();
        ListIterator listIterator = vector.listIterator();
        //print class names of the Iterators
        System.out.println(enumeration.getClass().getName());
        System.out.println(iterator.getClass().getName());
        System.out.println(listIterator.getClass().getName());
    }
}
