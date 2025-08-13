package Collections;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterfaceAddLastMethodNullPointerException {
    public static void main(String[]args) throws IllegalStateException{
        //Create object of type deque
        Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
        //add numbers to the end of the deque
        deque.addLast(111);
        deque.addLast(222);
        deque.addLast(333);
        deque.addLast(444);
        //try catch block
        try {
            deque.addLast(null);
        }
        catch (Exception e){
            System.out.println("Exception thrown " + "while inserting null: " + e);
        }

    }
}
