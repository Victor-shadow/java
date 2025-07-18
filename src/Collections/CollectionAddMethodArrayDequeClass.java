package Collections;
import java.util.*;
public class CollectionAddMethodArrayDequeClass {
    public static void main(String[]args){
        //Create an empty ArrayDeque
        Collection<String>deque = new ArrayDeque<String>();
        //Use add() method to add elements to the deque
        deque.add("January");
        deque.add("February");
        deque.add("March");
        deque.add("April");
        deque.add("May");
        //Display the Array Deque
        System.out.println("Array Deque: " + deque);

    }
}
