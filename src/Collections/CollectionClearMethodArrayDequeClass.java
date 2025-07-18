package Collections;
import java.util.*;

public class CollectionClearMethodArrayDequeClass {
    public static void main(String[]args){
        //Create an empty array Deque
        Collection<String> de_que = new ArrayDeque<String>();
        de_que.add("Monday");
        de_que.add("Tuesday");
        de_que.add("Wednesday");
        de_que.add("Thursday");
        de_que.add("Friday");
        //Display the Deque
        System.out.println("Array Deque " + de_que);
        //Clear the ArrayDeque
        de_que.clear();
        //Print the new ArrayDeque
        System.out.println("The new Array Deque: " + de_que);

    }

}
