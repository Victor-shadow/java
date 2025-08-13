package Collections;
import java.util.*;
public class DequeInterfaceContainsMethod {
    public static void main(String[]args){
        //Create an empty Deque
        Deque<Integer> de_que = new LinkedList<Integer>();
        //add elements into the deque
        de_que.add(100);
        de_que.add(200);
        de_que.add(300);
        de_que.add(400);
        de_que.add(500);
        //display the Deque
        System.out.println("Deque: " + de_que);
        //check for 100 in the deque
        System.out.println("Does the Deque contain '100'? " + de_que.contains(100));
        //check for 200  in the deque
        System.out.println("Does the Deque contain '200'? " + de_que.contains(200));
        //check for 600 in the deque
        System.out.println("Does the Deque contain '600'? " + de_que.contains(600));


    }
}
