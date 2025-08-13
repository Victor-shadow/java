package Collections;
import java.util.*;
public class DequeInterfaceContainsMethodArrayDeque {
    public static void main(String[]args){
        //Create an Empty Deque
        Deque<Integer> de_que = new ArrayDeque<Integer>();
        //add elements into the deque
        de_que.add(10);
        de_que.add(15);
        de_que.add(30);
        de_que.add(20);
        de_que.add(5);
        //Display the Deque
        System.out.println("Deque: " + de_que);
        //check for 15 in the deque
        System.out.println("Does the Deque contain '15'? " + de_que.contains(15));
        //check for 2 in the deque
        System.out.println("Does the Deque contain '2' ? " + de_que.contains(2));
        //check if the deque contains '10'
        System.out.println("Does the Deque contain '10' ? " + de_que.contains(10));

    }
}
