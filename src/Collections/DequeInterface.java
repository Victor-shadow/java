package Collections;
import java.util.*;
public class DequeInterface {
    public static void main(String[] args) {
        //Create a Deque of Strings
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("1");
        deque.addLast("2");

        String first = deque.removeFirst();
        String last = deque.removeLast();

        //Display the Deque
        System.out.println("First: " + first + ", Last: " + last);
    }
}

