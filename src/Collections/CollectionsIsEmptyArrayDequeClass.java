package Collections;
import java.util.*;
import java.io.*;
public class CollectionsIsEmptyArrayDequeClass {
    public static void main(String[]args){
        //Create an Empty Array DEQUE
        Collection<String> deque = new ArrayDeque<String>();
        deque.add("January");
        deque.add("February");
        deque.add("March");
        deque.add("April");
        deque.add("may");

        //Display the array deque
        System.out.println("Array Deque:" + deque);
        //Check if the array deque is empty using the isEmpty method
        System.out.println("Is the Array Deque empty: " + deque);
        //Clear the ArrayDeque
        deque.clear();
        //Print the deque
        System.out.println("The new Array Deque is: " + deque);
        //Check if the array deque is empty using the isEmpty method
        System.out.println("Is the Array Deque Empty: " + deque);

    }
}
