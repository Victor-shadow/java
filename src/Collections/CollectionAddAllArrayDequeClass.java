package Collections;
import java.util.*;

public class CollectionAddAllArrayDequeClass {
    public static void main(String[]args){
        //Create an Empty ArrayDeque
        Collection<String> de_que = new ArrayDeque<String>();
        //Create a new  Array deque
        Collection<String> deque = new ArrayDeque<String>();
        deque.add("January");
        deque.add("February");
        deque.add("March");
        deque.add("April");

        //Display the list
        System.out.println("The Array Deque is: " + de_que);
        //Append the collection to the list
        de_que.addAll(deque);
        //Display the new list
        System.out.println("The new array deque: " + de_que);

    }
}
