package Collections;
import java.util.*;

public class CollectionContainsArrayDequeClass {
    public static void main(String[]args){
        //Create an empty array deque
        Collection<String> deque = new ArrayDeque<>();
        deque.add("January");
        deque.add("February");
        deque.add("March");
        deque.add("April");
        //Display the ArrayDeque
        System.out.println("Array Deque: " + deque);
        boolean result = deque.contains("April");
        //print the result
        System.out.println("Is April Present in the Array Deque: " + result);
    }
}
